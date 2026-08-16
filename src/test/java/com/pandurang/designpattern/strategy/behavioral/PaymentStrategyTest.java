package com.pandurang.designpattern.strategy.behavioral;

import com.pandurang.designpattern.behavioral.strategy.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

public class PaymentStrategyTest {

    @Test
    void shouldProcessUpiPayment() {

        PaymentStrategy strategy =
                new UpiPaymentStrategy();

        PaymentContext context =
                new PaymentContext(strategy);

        context.pay(1000);
    }

    @Test
    void shouldProcessCreditCardPayment() {

        PaymentStrategy strategy =
                new CreditCardPaymentStrategy();

        PaymentContext context =
                new PaymentContext(strategy);

        context.pay(2000);
    }

    @Test
    void shouldProcessPaypalPayment() {

        PaymentStrategy strategy =
                new PaypalPaymentStrategy();

        PaymentContext context =
                new PaymentContext(strategy);

        context.pay(3000);
    }
}
