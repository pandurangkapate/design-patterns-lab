package com.pandurang.designpattern.behavioral.strategy;

public class UpiPaymentStrategy implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("Processing UPI payment: ₹" + amount);
    }
}
