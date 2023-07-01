package com.design_patern.strategy;

public class WalkMode implements IGoogleMapPathStrategy{
    @Override
    public void findPath() {
        System.out.println("Path for walk");
    }
}
