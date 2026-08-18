package com.pandurang.designpattern.behavioral.strategy.observer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class OrderCreatedEvent {

    private final String orderId;
    private final double amount;
}
