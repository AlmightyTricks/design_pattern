package com.design_patern.adpater;

public class GatewayFactory {
    public IGateWayAdpater pay(String type) {
        if(type.equals("paytm")) {
            return new PayTM();
        } else if(type.equals("payumoney")) {
            return new PayUMoney();
        } else {
            throw new IllegalArgumentException("Invalid gateway type");
        }
    }
}
