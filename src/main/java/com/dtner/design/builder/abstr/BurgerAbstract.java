package com.dtner.design.builder.abstr;

import com.dtner.design.builder.impl.ＷrapperImpl;
import com.dtner.design.builder.iter.Item;
import com.dtner.design.builder.iter.Packing;

import java.math.BigDecimal;

/**
 * @ClassName Burger
 * @Description: 汉堡
 * @Author dt
 * @Date 2020-07-29
 **/
public abstract class BurgerAbstract implements Item {


    @Override
    public Packing packing() {
        return new ＷrapperImpl();
    }

    @Override
    public abstract BigDecimal price();
}
