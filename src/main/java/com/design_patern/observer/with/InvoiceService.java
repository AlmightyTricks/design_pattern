package com.design_patern.observer.with;

public class InvoiceService implements OrderPlacedObserver{

    public InvoiceService(Amazon amazon) {
        amazon.addObservers(this);
    }

    public void generateInvoice() {
        System.out.println("Invoice generate");
    }

    @Override
    public void orderPlaced() {
        generateInvoice();
    }
}
