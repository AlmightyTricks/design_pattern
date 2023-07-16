package com.design_patern.observer.with;

public class EmailService implements OrderPlacedObserver{

    public EmailService(Amazon amazon) {
        amazon.addObservers(this);
    }
    public void sendEmail() {
        System.out.println("Send email");
    }

    @Override
    public void orderPlaced() {
        sendEmail();
    }
}
