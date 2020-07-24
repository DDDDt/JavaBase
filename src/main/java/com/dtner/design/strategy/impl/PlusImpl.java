package com.dtner.design.strategy.impl;

import com.dtner.design.strategy.iter.NumIter;

/**
 * @ClassName PlusImpl
 * @Description: 相加
 * @Author dt
 * @Date 2020-07-24
 **/
public class PlusImpl implements NumIter {

    public PlusImpl(int i) {
    }

    public Integer num(Integer num1, Integer num2) {
        return num1 + num2;
    }
}
