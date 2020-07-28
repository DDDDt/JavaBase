package com.dtner.design.abstractFactory.impl;

import com.dtner.design.abstractFactory.iter.ColorIter;

/**
 * @ClassName RedColorImpl
 * @Description: 红色
 * @Author dt
 * @Date 2020-07-27
 **/
public class RedColorImpl implements ColorIter {

    @Override
    public void fill() {
        System.out.println("red ...");
    }
}
