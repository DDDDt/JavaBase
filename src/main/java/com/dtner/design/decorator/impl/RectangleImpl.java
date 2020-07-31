package com.dtner.design.decorator.impl;

import com.dtner.design.decorator.iter.ShapeIter;

/**
 * @ClassName RectangleImpl
 * @Description: 矩形
 * @Author dt
 * @Date 2020-07-31
 **/
public class RectangleImpl implements ShapeIter {
    @Override
    public void draw() {
        System.out.println("Shape: 矩形");
    }
}
