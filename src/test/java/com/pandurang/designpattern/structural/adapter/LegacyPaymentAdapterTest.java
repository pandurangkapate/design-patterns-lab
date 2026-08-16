package com.pandurang.designpattern.structural.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class LegacyPaymentAdapterTest {

    // The Adapter becomes valuable when our application wants to work with a common interface, while external/legacy systems have incompatible APIs.

    @Test
    void shouldProcessPaymentUsingLegacyService() {

        LegacyPaymentService legacyPaymentService =
                new LegacyPaymentService();

        PaymentGateway paymentGateway =
                new LegacyPaymentAdapter(legacyPaymentService);

        assertDoesNotThrow(() -> paymentGateway.pay(1000));
    }
}
