package com.dtner.design.chain.impl;

import com.dtner.design.chain.abstr.AbstractLogger;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("Eroor Console: "+message);
    }
}
