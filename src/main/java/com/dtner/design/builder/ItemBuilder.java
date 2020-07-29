package com.dtner.design.builder;

import com.dtner.design.builder.iter.Item;

/**
 * @ClassName ItemBuilder
 * @Description: 建造类
 * @Author dt
 * @Date 2020-07-29
 **/
public class ItemBuilder {

    public Item chickenBurgerBuilder(){
        return new ChickenBurger();
    }

    public Item vegBurgerBuilder(){
        return new VegBurger();
    }

}
