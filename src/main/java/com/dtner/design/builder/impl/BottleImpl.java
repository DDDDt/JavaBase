package com.dtner.design.builder.impl;

import com.dtner.design.builder.iter.Packing;

/**
 * @ClassName Bottle
 * @Description: 瓶子
 * @Author dt
 * @Date 2020-07-29
 **/
public class BottleImpl implements Packing {
    @Override
    public String pack() {
        return "瓶子";
    }
}
