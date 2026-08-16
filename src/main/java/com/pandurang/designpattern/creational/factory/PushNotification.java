package com.pandurang.designpattern.creational.factory;

public class PushNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Sending Push: " + message);
    }
}
