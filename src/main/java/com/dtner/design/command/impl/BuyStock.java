package com.dtner.design.command.impl;

import com.dtner.design.command.iter.Order;
import com.dtner.design.command.request.Stock;

public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
