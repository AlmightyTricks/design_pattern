package com.design_patern.factory;

public class SMSNotification implements INotification{

    @Override
    public void sendNotification() {
        System.out.println("Send notification via SMS");
    }
}
