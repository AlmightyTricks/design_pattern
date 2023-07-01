package com.design_patern.singleton;

public class Logger1 {

    private static Logger1 logger1 = new Logger1();

    private Logger1() {}

    public static Logger1 getInstance() {
        return logger1;
    }
}
