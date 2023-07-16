package com.design_patern.observer.with;

public class CourierService implements OrderPlacedObserver{

    public CourierService(Amazon amazon) {
        amazon.addObservers(this);
    }

    public void delivery() {
        System.out.println("Delivered..");
    }


    @Override
    public void orderPlaced() {
        delivery();
    }
}
