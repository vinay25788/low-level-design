package service;

import exception.CarNotAvailableException;
import exception.InvalidDateRangeException;
import exception.OptimisticLockException;
import exception.ReservationException;
import model.Car;
import model.Customer;
import model.Reservation;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ReservationService {

    Map<String, Reservation> reservationMap = new ConcurrentHashMap<>();

    public Reservation createReservation(Customer customer, Car car, LocalDate startDate, LocalDate endDate)
    {
        validateDateRange(startDate, endDate);

        if(!isAvailableCar(car, startDate, endDate))
        {
            throw new CarNotAvailableException("Car +"+ car.getLicensePlate() +" is not available");
        }

        if(!car.tryIncrementVersion(car.getVersion().get()))
        {
            throw new OptimisticLockException(" someone already booked the car "+car.getLicensePlate());
        }

        String reservationId = UUID.randomUUID().toString();

        Reservation reservation = new Reservation(reservationId,customer,car, startDate, endDate);

        reservationMap.put(reservationId, reservation);
        return reservation;
    }


    public void validateDateRange(LocalDate startDate, LocalDate endDate)
    {
        if(startDate == null || endDate == null || startDate.isAfter(endDate) )
             throw new InvalidDateRangeException(startDate,endDate );
    }

    private boolean isAvailableCar(Car car,LocalDate startDate, LocalDate endDate)
    {
        for(Reservation r: reservationMap.values())
        {
            if(r.getCar().equals(car))
            {
                if(startDate.isBefore(r.getEndDate()) && endDate.isAfter(r.getStartDate()))
                     return false;
            }
        }
        return true;
    }

    public Collection<Reservation> reservations()
    {
        return reservationMap.values();
    }
}
