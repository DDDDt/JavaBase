package com.dtner.design.strategy.impl;

import com.dtner.design.strategy.iter.NumIter;

/**
 * @ClassName ReduceImpl
 * @Description: 相减
 * @Author dt
 * @Date 2020-07-24
 **/
public class ReduceImpl implements NumIter {

    public Integer num(Integer num1, Integer num2) {
        return num1 - num2;
    }
}
