package com.design_patern.adpater;

public class Client {
    public static void main(String[] args) {
//        IGateWayAdpater iGateWayAdpater = new PayUMoney();
//        iGateWayAdpater.pay(6000);

        IGateWayAdpater iGateWayAdpater = new GatewayFactory().pay("paytm");
        iGateWayAdpater.pay(5000);
    }
}
