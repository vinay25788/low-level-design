package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

public class Reservation {

    private String reservationId;
    private Customer customer;
    private Car car;
    private LocalDate startDate;
    private LocalDate endDate;
    private double totalPrice;

    public Reservation(String reservationId, Customer customer, Car car, LocalDate statDate, LocalDate endDate)
    {
        this.reservationId = reservationId;
        this.customer = customer;
        this.car =car;
        this.startDate = statDate;
        this.endDate = endDate;
        this.totalPrice = calculatePrice();

    }

    private Double calculatePrice()
    {
        long numberOfDays = ChronoUnit.DAYS.between(startDate, endDate)+1;
        return car.getPricePerDay() * numberOfDays;
    }

    public String getReservationId() {
        return reservationId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Car getCar() {
        return car;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
