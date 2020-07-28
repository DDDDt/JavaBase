package com.dtner.design.abstractFactory.impl;

import com.dtner.design.factory.iter.ShapIter;

/**
 * @ClassName CircleShapeImpl
 * @Description:
 * @Author dt
 * @Date 2020-07-27
 **/
public class CircleShapeImpl implements ShapIter {

    @Override
    public void draw() {
        System.out.println("circle ...");
    }
}
