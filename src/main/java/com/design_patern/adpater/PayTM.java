package com.design_patern.adpater;

import com.design_patern.adpater.sdkthrirdparty.PaytmSDK;

public class PayTM implements IGateWayAdpater{
    @Override
    public void pay(int amount) {
        PaytmSDK pytm = new PaytmSDK();
        pytm.moneyTransaction(amount);
    }
}
