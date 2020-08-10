package com.dtner.design.facade.impl;

import com.dtner.design.facade.iter.Shape;

/**
 * @ClassName Square
 * @Description:
 * @Author dt
 * @Date 2020-08-10
 **/
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square :: draw()");
    }
}
