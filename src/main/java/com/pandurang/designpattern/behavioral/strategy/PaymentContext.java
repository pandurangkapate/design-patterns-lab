package com.pandurang.designpattern.behavioral.strategy;

public class PaymentContext {

    private final PaymentStrategy paymentStrategy;

    public  PaymentContext(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(double amount){
        paymentStrategy.pay(amount);
    }
}
