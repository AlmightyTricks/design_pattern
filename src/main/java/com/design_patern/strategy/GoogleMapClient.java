package com.design_patern.strategy;

import java.util.Scanner;

public class GoogleMapClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mode = sc.next();

        IGoogleMapPathStrategy iGoogleMapPathStrategy = new Factory().createObject(mode);
        iGoogleMapPathStrategy.findPath();
    }
}
