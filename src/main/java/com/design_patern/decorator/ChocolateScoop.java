package com.design_patern.decorator;

public class ChocolateScoop extends IceCreamDecorator{
    public ChocolateScoop(IceCreamCone iceCreamCone) {
        super(iceCreamCone);
    }

    @Override
    public String getIceCream() {
        return super.getIceCream() + " with chocolate";
    }

    @Override
    public int bill() {
        return super.bill() + 10;
    }
}
