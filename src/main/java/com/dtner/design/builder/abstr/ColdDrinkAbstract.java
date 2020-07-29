package com.dtner.design.builder.abstr;

import com.dtner.design.builder.impl.BottleImpl;
import com.dtner.design.builder.iter.Item;
import com.dtner.design.builder.iter.Packing;

import java.math.BigDecimal;

/**
 * @ClassName ColdDrink
 * @Description:
 * @Author dt
 * @Date 2020-07-29
 **/
public abstract class ColdDrinkAbstract implements Item {

    @Override
    public Packing packing() {
        return new BottleImpl();
    }

    @Override
    public abstract BigDecimal price();
}
