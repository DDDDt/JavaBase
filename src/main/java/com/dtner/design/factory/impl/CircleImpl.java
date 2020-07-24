package com.dtner.design.factory.impl;

import com.dtner.design.factory.iter.ShapIter;

/**
 * @ClassName CircleImpl
 * @Description:
 * @Author dt
 * @Date 2020-07-24
 **/
public class CircleImpl implements ShapIter {
    public void draw() {
        System.out.println("圆形");
    }
}
