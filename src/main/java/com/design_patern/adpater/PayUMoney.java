package com.design_patern.adpater;

import com.design_patern.adpater.sdkthrirdparty.PayUmoneySDK;

public class PayUMoney implements IGateWayAdpater{

    @Override
    public void pay(int amount) {
        PayUmoneySDK payU = new PayUmoneySDK();
        payU.makePayment(amount);
    }
}
