package com.pandurang.designpattern.behavioral.strategy.observer;

public interface OrderObserver {

    void onOrderCreated(OrderCreatedEvent event);
}
