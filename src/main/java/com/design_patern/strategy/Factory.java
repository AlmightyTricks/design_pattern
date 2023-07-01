package com.design_patern.strategy;

public class Factory {
    public IGoogleMapPathStrategy createObject(String mode) {
        if(mode.equals("car")) {
            return new CarMode();
        } else if(mode.equals("walk")) {
            return new WalkMode();
        } else {
            throw  new IllegalArgumentException("Invalid Input");
        }
    }
}
