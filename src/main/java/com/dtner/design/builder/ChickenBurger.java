package com.dtner.design.builder;

import com.dtner.design.builder.abstr.BurgerAbstract;

import java.math.BigDecimal;

/**
 * @ClassName ChickenBurger
 * @Description:
 * @Author dt
 * @Date 2020-07-29
 **/
public class ChickenBurger extends BurgerAbstract {

    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(50.5);
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
