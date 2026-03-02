package facade;

import demo.payment.PaymentType;
import model.Car;
import model.Customer;
import model.Reservation;
import service.CarService;
import service.PaymentService;
import service.ReservationService;

import java.time.LocalDate;

public class CarRentalSystem {

    private final ReservationService reservationService = new ReservationService();
    private final CarService carService = new CarService(reservationService);

    private final PaymentService paymentService = new PaymentService();



    public void addCar(Car car)
    {
        carService.addCar(car);
    }

    public Reservation bookCar(Customer customer, Car car, LocalDate startDate, LocalDate endDate)
    {
        return reservationService.createReservation(customer, car, startDate, endDate);
    }

    public boolean pay(Reservation reservation, PaymentType type)
    {
        return paymentService.processPayment(reservation, type);
    }
}
