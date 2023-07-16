package com.design_patern.observer.without;

public class Client {
    public static void main(String[] args) {
        Amazon amazon = new Amazon(
                new EmailService(),
                new InvoiceService(),
                new SMSService()
        );

        amazon.orderPlace();
    }
}
