package com.pandurang.designpattern.behavioral.strategy;

public class PaypalPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Processing UPI payment: ₹" + amount);
    }
}
