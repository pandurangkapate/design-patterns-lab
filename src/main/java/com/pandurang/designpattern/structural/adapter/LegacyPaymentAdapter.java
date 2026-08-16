package com.pandurang.designpattern.structural.adapter;

public class LegacyPaymentAdapter implements PaymentGateway {

    private final LegacyPaymentService legacyPaymentService;

    LegacyPaymentAdapter(LegacyPaymentService legacyPaymentService){
        this.legacyPaymentService = legacyPaymentService;
    }

    @Override
    public void pay(double amount) {
        legacyPaymentService.makePayment(amount);
    }
}
