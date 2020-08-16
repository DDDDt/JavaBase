package com.dtner.design.command.request;

public class Stock {

    private String name = "ABC";

    private int quantity = 10;

    public void buy(){
        System.out.println("buy , name = "+name + ",Quantity = "+quantity);
    }

    public void sell(){
        System.out.println("sell,Name = "+name+", Quantity: "+quantity);
    }


}
