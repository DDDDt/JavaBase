package com.dtner.design.facade.impl;

import com.dtner.design.facade.iter.Shape;

/**
 * @ClassName Circle
 * @Description:
 * @Author dt
 * @Date 2020-08-10
 **/
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle :: draw()");
    }
}
