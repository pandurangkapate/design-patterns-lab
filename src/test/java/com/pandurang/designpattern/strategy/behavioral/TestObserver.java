package com.pandurang.designpattern.strategy.behavioral;

import com.pandurang.designpattern.behavioral.strategy.observer.OrderCreatedEvent;
import com.pandurang.designpattern.behavioral.strategy.observer.OrderObserver;

public class TestObserver implements OrderObserver {

    private int notificationCount;
    private String orderId;
    private double amount;

    @Override
    public void onOrderCreated(OrderCreatedEvent event) {
        notificationCount++;
        orderId = event.getOrderId();
        amount = event.getAmount();
    }

    public int getNotificationCount() {
        return notificationCount;
    }

    public String getOrderId() {
        return orderId;
    }

    public double getAmount() {
        return amount;
    }
}
