package com.dtner.design.chain.abstr;

public abstract class AbstractLogger {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    public int level;

    private AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level,String message){
        if(this.level <= level){
            write(message);
        }
        if(message != null){
            nextLogger.logMessage(level,message);
        }
    }

   public abstract void write(String message);
}
