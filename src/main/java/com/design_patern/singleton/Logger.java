package com.design_patern.singleton;

import java.io.Serializable;

public class Logger implements Serializable {

    private static Logger logger = null;

    private Logger() {}

    public static Logger getInstance() {
        if(logger == null) {
            logger = new Logger();
        }

        return logger;
    }
}

//
