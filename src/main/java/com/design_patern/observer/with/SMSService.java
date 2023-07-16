package com.design_patern.observer.with;

public class SMSService implements OrderPlacedObserver{

    public SMSService(Amazon amazon) {
        amazon.addObservers(this);
    }

    public void sendSMS() {
        System.out.println("Send SMS");
    }

    @Override
    public void orderPlaced() {
        sendSMS();
    }
}
