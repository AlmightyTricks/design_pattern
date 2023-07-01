package com.design_patern.factory;

public class Client {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        INotification iNotification = notificationFactory.createObject("SMS");
        iNotification.sendNotification();
    }
}
