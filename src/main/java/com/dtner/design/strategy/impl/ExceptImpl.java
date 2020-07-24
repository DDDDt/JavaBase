package com.dtner.design.strategy.impl;

import com.dtner.design.strategy.iter.NumIter;

/**
 * @ClassName ExceptImpl
 * @Description: 除
 * @Author dt
 * @Date 2020-07-24
 **/
public class ExceptImpl implements NumIter {

    public Integer num(Integer num1, Integer num2) {
        return num1 / num2;
    }
}
