package com.pandurang.designpattern.behavioral.strategy.observer;

import java.util.ArrayList;
import java.util.List;

public class OrderEventPublisher {

    private final List<OrderObserver> observers = new ArrayList<>();

    public void subscribe(OrderObserver orderObserver){
        observers.add(orderObserver);
    }

    public void unsubscribe(OrderObserver orderObserver){
        observers.remove(orderObserver);
    }

    public void publishEvent(OrderCreatedEvent event){
        for (OrderObserver observer : observers) {
            observer.onOrderCreated(event);
        }
    }

}
