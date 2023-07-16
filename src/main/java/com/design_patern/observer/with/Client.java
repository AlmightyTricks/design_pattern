package com.design_patern.observer.with;

public class Client {
    public static void main(String[] args) {
//        Amazon amazon = new Amazon();
//        amazon.addObservers(
//                new EmailService()
//        );
//        amazon.addObservers(
//                new SMSService()
//        );
//        amazon.addObservers(
//                new InvoiceService()
//        );
//        amazon.addObservers(
//                new CourierService()
//        );
//
//        amazon.placeOrderInAmazon();

        Amazon amazon = new Amazon();
        new EmailService(amazon);
        new SMSService(amazon);
        new InvoiceService(amazon);
        new CourierService(amazon);

        amazon.placeOrderInAmazon();



    }
}
