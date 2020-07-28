package com.dtner.design.abstractFactory.impl;

import com.dtner.design.abstractFactory.iter.ColorIter;

/**
 * @ClassName GreenColorImpl
 * @Description:
 * @Author dt
 * @Date 2020-07-27
 **/
public class GreenColorImpl implements ColorIter {

    @Override
    public void fill() {
        System.out.println("green ...");
    }
}
