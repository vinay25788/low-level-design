package service;

import demo.payment.PaymentStrategy;
import demo.payment.PaymentStrategyFactory;
import demo.payment.PaymentType;
import model.Reservation;

public class PaymentService {

    public boolean processPayment(Reservation reservation, PaymentType type)
    {
        PaymentStrategy strategy = PaymentStrategyFactory.getPaymentStrategy(type);

        return strategy.pay(reservation.getTotalPrice());
    }
}
