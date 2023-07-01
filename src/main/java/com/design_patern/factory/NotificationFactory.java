package com.design_patern.factory;

public class NotificationFactory {
    public INotification createObject(String type) {
        if(type.equals("SMS")) {
            return new SMSNotification();
        } else if(type.equals("EMAIL")) {
            return new EmailNotification();
        } else {
            throw new RuntimeException("Provide correct type");
        }
    }
}
