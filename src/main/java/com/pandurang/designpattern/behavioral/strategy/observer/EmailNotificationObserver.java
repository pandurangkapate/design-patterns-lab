package com.pandurang.designpattern.behavioral.strategy.observer;

public class EmailNotificationObserver implements OrderObserver {

    // Observer allows one object to notify multiple interested objects without tightly coupling the publisher to concrete implementations. The publisher depends only on the OrderObserver abstraction. New observers can be added without modifying the publisher.
    @Override
    public void onOrderCreated(OrderCreatedEvent event) {
        System.out.println(
                "Email sent for order: " + event.getOrderId()
        );
    }
}
