package com.pandurang.designpattern.creational.factory;

public class NotificationFactory {

    public Notification createNotification(NotificationType type){

        if (NotificationType.EMAIL == type) {
            return new EmailNotification();

        } else if (NotificationType.SMS == type) {
            return new SMSNotification();

        } else if (NotificationType.PUSH == type) {
            return new PushNotification();
        }

        throw new IllegalArgumentException(
                "Unknown notification type: " + type
        );

    }
}
