package com.pandurang.designpattern.behavioral.strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Processing UPI payment: ₹" + amount);
    }
}
