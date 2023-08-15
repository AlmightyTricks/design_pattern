package com.design_patern.decorator;

public class BaseVanillaScoopIceCream implements IceCreamCone{
    @Override
    public String getIceCream() {
        return "Simple Cone With Vanilla Scope";
    }

    @Override
    public int bill() {
        return 20;
    }
}
