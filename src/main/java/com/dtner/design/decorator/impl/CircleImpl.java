package com.dtner.design.decorator.impl;

import com.dtner.design.decorator.iter.ShapeIter;

/**
 * @ClassName CircleImpl
 * @Description:
 * @Author dt
 * @Date 2020-07-31
 **/
public class CircleImpl implements ShapeIter {
    @Override
    public void draw() {
        System.out.println("Shape: 圆形");
    }
}
