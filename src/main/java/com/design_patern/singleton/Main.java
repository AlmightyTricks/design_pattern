package com.design_patern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {
        //Lazy Initaialization
        /*Logger logger = Logger.getInstance();
        System.out.println(logger.hashCode());

        Logger logger1 = Logger.getInstance();
        System.out.println(logger1.hashCode());*/

        // Eager Initialization
        /*Logger1 logger1 = Logger1.getInstance();
        System.out.println(logger1.hashCode());

        Logger1 logger2 = Logger1.getInstance();
        System.out.println(logger2.hashCode());*/

        /*try{

            Logger logger = Logger.getInstance();
            System.out.println(logger.hashCode());

            Constructor<Logger> loggerConstructor = Logger.class.getDeclaredConstructor();
            loggerConstructor.setAccessible(true);
            Logger logger1 = loggerConstructor.newInstance();
            System.out.println("Using Refection API");
            System.out.println(logger1.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        // Using serialization

        /*try {
            Logger logger = Logger.getInstance();
            System.out.println(logger.hashCode());
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("logger.test"));
            objectOutputStream.writeObject(logger);

            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("logger.test"));
            Logger logger1 = (Logger) objectInputStream.readObject();
            System.out.println("After serialiozation : " + logger1.hashCode());
        } catch(Exception e) {
            e.printStackTrace();
        }*/

        LoggerEnum loggerEnum = LoggerEnum.INSTANCE;
        System.out.println(loggerEnum.hashCode());

        LoggerEnum loggerEnum1 = LoggerEnum.INSTANCE;
        System.out.println(loggerEnum1.hashCode());


    }
}
