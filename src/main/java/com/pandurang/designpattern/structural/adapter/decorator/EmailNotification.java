package com.pandurang.designpattern.structural.adapter.decorator;

public class EmailNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}
