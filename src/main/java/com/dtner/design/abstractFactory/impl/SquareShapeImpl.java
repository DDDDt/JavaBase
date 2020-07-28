package com.dtner.design.abstractFactory.impl;

import com.dtner.design.factory.iter.ShapIter;

/**
 * @ClassName SquareShapeImpl
 * @Description:
 * @Author dt
 * @Date 2020-07-27
 **/
public class SquareShapeImpl implements ShapIter {

    @Override
    public void draw() {
        System.out.println("Square ...");
    }
}
