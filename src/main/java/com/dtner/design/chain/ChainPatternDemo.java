package com.dtner.design.chain;

import com.dtner.design.chain.abstr.AbstractLogger;
import com.dtner.design.chain.impl.ConsoleLogger;
import com.dtner.design.chain.impl.ErrorLogger;
import com.dtner.design.chain.impl.FileLogger;

public class ChainPatternDemo {

    private static AbstractLogger getChainOfLogger(){
        ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        FileLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        ConsoleLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args) {

        AbstractLogger loggerChain = getChainOfLogger();

        loggerChain.logMessage(AbstractLogger.INFO,"This is an information.");
        loggerChain.logMessage(AbstractLogger.DEBUG,"This is a debug level information.");
        loggerChain.logMessage(AbstractLogger.ERROR,"This is an error information.");
    }

}
