package com.design_patern.facad;

public class Amazon {
    private PaymentService paymentService;
    private OrderSevice orderSevice;
    private CourierService courierService;

    public Amazon() {
        paymentService = new PaymentService();
        orderSevice = new OrderSevice();
        courierService = new CourierService();
    }

    public void order() {
        paymentService.pay(2000);
        orderSevice.orderPlaced();
        courierService.sendProduct();
    }
}
