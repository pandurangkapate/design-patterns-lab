package com.pandurang.designpattern.structural.adapter.decorator;

public class SmsNotificationDecorator extends NotificationDecorator{

    public SmsNotificationDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String message) {

        super.send(message);

        System.out.println("SMS sent: " + message);
    }
}
