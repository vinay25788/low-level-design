package demo;

import demo.payment.PaymentType;
import exception.ReservationException;
import facade.CarRentalSystem;
import model.Car;
import model.Customer;
import model.Reservation;

import java.time.LocalDate;

public class CarRentalSystemDemo {

    public static void main(String[] args) {
        CarRentalSystem carRentalSystem = new CarRentalSystem();
        Car car = new Car("123", "Thar", "4By4", 2000, "Mahindra");
        carRentalSystem.addCar(car);

        Customer customer = new Customer("Vinay", "12@gmail.com","123Licence");
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = startDate.plusDays(2);
        try
        {
            Reservation reservation = carRentalSystem.bookCar(customer,car, startDate,endDate);
            carRentalSystem.pay(reservation, PaymentType.CREDIT_CARD);
            System.out.println(" Reservation is successful "+reservation.getReservationId());

        }catch (ReservationException exception)
        {
            System.out.println("booking failed "+exception.getMessage());
        }
    }
}
