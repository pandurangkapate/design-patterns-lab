package com.pandurang.designpattern.creational;

import com.pandurang.designpattern.creational.factory.Notification;
import com.pandurang.designpattern.creational.factory.NotificationFactory;
import com.pandurang.designpattern.creational.factory.NotificationType;
import com.pandurang.designpattern.creational.factory.PushNotification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Factory {

    @Test
    void shouldCreateEmailNotification() {

        NotificationFactory factory = new NotificationFactory();

        Notification notification =
                factory.createNotification(NotificationType.EMAIL);

        notification.send("Order created");
    }

    @Test
    void shouldCreatePushNotification() {

        NotificationFactory factory = new NotificationFactory();

        Notification notification =
                factory.createNotification(NotificationType.PUSH);

        assertInstanceOf(PushNotification.class, notification);
    }

    @Test
    void shouldThrowExceptionForNullNotificationType() {

        NotificationFactory factory = new NotificationFactory();

        assertThrows(
                IllegalArgumentException.class,
                () -> factory.createNotification(null)
        );
    }
}
