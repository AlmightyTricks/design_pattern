package com.design_patern.decorator;

public class Customer {
    public static void main(String[] args) {
        // Order 1
        System.out.println("------------------------Order 1-------------------------");
        IceCreamCone order1 = new BaseVanillaScoopIceCream();
        System.out.println(order1.getIceCream());
        System.out.println("Order 1 bill $ " + order1.bill());

        // Order 2
        System.out.println("------------------------Order 2-------------------------");
        IceCreamCone order2 = new ChocolateScoop(new BaseVanillaScoopIceCream());
        System.out.println(order2.getIceCream());
        System.out.println("Order 2 bill $ " + order2.bill());

        // Order 3
        System.out.println("------------------------Order 3-------------------------");
        IceCreamCone order3 = new MangoScoop(new ChocolateScoop(new BaseVanillaScoopIceCream()));
        System.out.println(order3.getIceCream());
        System.out.println("Order 3 bill $ " + order3.bill());
    }
}
