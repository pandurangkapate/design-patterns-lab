package com.pandurang.designpattern.behavioral.strategy.observer;

public class SmsNotificationObserver implements OrderObserver{
    @Override
    public void onOrderCreated(OrderCreatedEvent event) {
        System.out.println(
                "SMS sent for order: " + event.getOrderId()
        );
    }
}
