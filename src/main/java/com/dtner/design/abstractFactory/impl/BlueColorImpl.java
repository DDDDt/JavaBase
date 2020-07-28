package com.dtner.design.abstractFactory.impl;

import com.dtner.design.abstractFactory.iter.ColorIter;

/**
 * @ClassName BlueColorImpl
 * @Description: 蓝色
 * @Author dt
 * @Date 2020-07-27
 **/
public class BlueColorImpl implements ColorIter {

    @Override
    public void fill() {
        System.out.println("blue ...");
    }
}
