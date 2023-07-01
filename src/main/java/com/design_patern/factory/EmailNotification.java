package com.design_patern.factory;

public class EmailNotification implements INotification{

    @Override
    public void sendNotification() {
        System.out.println("Send notification via email.");
    }
}
