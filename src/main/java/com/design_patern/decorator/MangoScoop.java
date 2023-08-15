package com.design_patern.decorator;

public class MangoScoop extends IceCreamDecorator{
    public MangoScoop(IceCreamCone iceCreamCone) {
        super(iceCreamCone);
    }

    @Override
    public String getIceCream() {
        return super.getIceCream() + " with mango scope";
    }

    @Override
    public int bill() {
        return super.bill() + 5;
    }
}
