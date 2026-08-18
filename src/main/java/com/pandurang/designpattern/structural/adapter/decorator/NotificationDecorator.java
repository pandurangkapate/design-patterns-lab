package com.pandurang.designpattern.structural.adapter.decorator;

public class NotificationDecorator implements Notification{

    public Notification notification;

    public NotificationDecorator(Notification notification){
        this.notification = notification;
    }

    @Override
    public void send(String message) {
        notification.send(message);
    }

}
