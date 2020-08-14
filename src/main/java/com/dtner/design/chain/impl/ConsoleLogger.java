package com.dtner.design.chain.impl;

import com.dtner.design.chain.abstr.AbstractLogger;

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("console log: "+message);
    }
}
