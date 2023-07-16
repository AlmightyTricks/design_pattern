package com.design_patern.observer.with;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
    List<OrderPlacedObserver> orderPlacedObservers = new ArrayList<>();

    public void addObservers(OrderPlacedObserver observer) {
        orderPlacedObservers.add(observer);
    }

    public void removeObserver(OrderPlacedObserver observer) {
        orderPlacedObservers.remove(observer);
    }

    void placeOrderInAmazon() {
        for(OrderPlacedObserver observer : orderPlacedObservers) {
            observer.orderPlaced();
        }
    }
}
