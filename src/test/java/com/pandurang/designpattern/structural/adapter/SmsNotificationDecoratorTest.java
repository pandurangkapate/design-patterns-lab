package com.pandurang.designpattern.structural.adapter;

import com.pandurang.designpattern.structural.adapter.decorator.EmailNotification;
import com.pandurang.designpattern.structural.adapter.decorator.Notification;
import com.pandurang.designpattern.structural.adapter.decorator.SmsNotificationDecorator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class SmsNotificationDecoratorTest {

    @Test
    void shouldSendEmailAndSmsNotification() {

        // Concrete Component
        Notification emailNotification =
                new EmailNotification();

        // Decorator wrapping Email
        Notification smsNotification =
                new SmsNotificationDecorator(emailNotification);

        assertDoesNotThrow(
                () -> smsNotification.send("Order created")
        );
    }
}
