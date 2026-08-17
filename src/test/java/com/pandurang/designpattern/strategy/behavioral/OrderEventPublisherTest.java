package com.pandurang.designpattern.strategy.behavioral;

import com.pandurang.designpattern.behavioral.strategy.observer.OrderCreatedEvent;
import com.pandurang.designpattern.behavioral.strategy.observer.OrderEventPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderEventPublisherTest {

    @Test
    void shouldNotifyAllSubscribedObservers() {

        OrderEventPublisher publisher = new OrderEventPublisher();

        TestObserver observer1 = new TestObserver();
        TestObserver observer2 = new TestObserver();

        publisher.subscribe(observer1);
        publisher.subscribe(observer2);

        OrderCreatedEvent event =
                new OrderCreatedEvent("ORD-101", 2500);

        publisher.publishEvent(event);

        assertEquals(1, observer1.getNotificationCount());
        assertEquals(1, observer2.getNotificationCount());

        assertEquals("ORD-101", observer1.getOrderId());
        assertEquals(2500, observer1.getAmount());
    }


    @Test
    void shouldNotNotifyUnsubscribedObserver() {

        OrderEventPublisher publisher = new OrderEventPublisher();

        TestObserver observer = new TestObserver();

        publisher.subscribe(observer);
        publisher.unsubscribe(observer);

        publisher.publishEvent(
                new OrderCreatedEvent("ORD-102", 1500)
        );

        assertEquals(0, observer.getNotificationCount());
    }
}
