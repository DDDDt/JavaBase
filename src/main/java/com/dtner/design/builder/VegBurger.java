package com.dtner.design.builder;

import com.dtner.design.builder.abstr.BurgerAbstract;

import java.math.BigDecimal;

/**
 * @ClassName VegBurger
 * @Description:
 * @Author dt
 * @Date 2020-07-29
 **/
public class VegBurger extends BurgerAbstract {

    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(25);
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
