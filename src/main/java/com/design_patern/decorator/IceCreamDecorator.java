package com.design_patern.decorator;

public abstract class IceCreamDecorator implements IceCreamCone{
    private IceCreamCone iceCreamCone;
    public IceCreamDecorator(IceCreamCone iceCreamCone) {
        this.iceCreamCone = iceCreamCone;
    }

    public String getIceCream() {
        return this.iceCreamCone.getIceCream();
    }

    @Override
    public int bill() {
        return this.iceCreamCone.bill();
    }
}
