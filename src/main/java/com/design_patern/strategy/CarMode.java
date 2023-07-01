package com.design_patern.strategy;

public class CarMode implements IGoogleMapPathStrategy{
    @Override
    public void findPath() {
        System.out.println("Path for car.");
    }
}
