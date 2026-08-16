package com.pandurang.designpattern.structural.adapter;

public class LegacyPaymentService {

    public void makePayment(double amount) {
        System.out.println("Payment processed through legacy system: " + amount);
    }
}
