package com.design_patern.builder;

public class Client {
    public static void main(String[] args) {
        Employee e = Employee.createBuilder()
                .setName("Jhon")
                .setEmail("abc@gmail.com")
                .setAddress("India")
                .setSalary(50000)
                .setSkill("java")
                .build();

        System.out.println(e.getName() + " " + e.getEmail() + " " + e.getAddress() + " " + e.getSalary() + " " + e.getSkill());

    }
}
