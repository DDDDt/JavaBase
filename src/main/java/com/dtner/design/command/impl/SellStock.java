package com.dtner.design.command.impl;

import com.dtner.design.command.iter.Order;
import com.dtner.design.command.request.Stock;

public class SellStock implements Order{

    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
