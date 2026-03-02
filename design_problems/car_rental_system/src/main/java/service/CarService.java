package service;

import model.Car;
import model.Reservation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CarService {

    Map<String, Car> cars = new ConcurrentHashMap<>();
    private final ReservationService reservationService;

    public CarService(ReservationService reservationService)
    {
        this.reservationService = reservationService;
    }


    public void addCar(Car car)
    {
        cars.put(car.getLicensePlate(), car);
    }


    public List<Car> searchAvailableCar(String make, String model, LocalDate startDate, LocalDate endDate)
    {
        List<Car> result = new ArrayList<>();
        for(Car car: cars.values())
        {
            if(car.getMake().equals(make) && car.getModel().equals( model) && isAvailableCar(car, startDate, endDate))
            {
                result.add(car);
            }
        }
        return result;
    }

    private boolean isAvailableCar(Car car, LocalDate startDate, LocalDate endDate)
    {
        for(Reservation r: reservationService.reservations())
        {
            if(r.getCar().equals(car))
            {
                if(startDate.isBefore(r.getEndDate()) && endDate.isAfter(r.getStartDate()))
                      return false;
            }
        }
        return true;
    }
}
