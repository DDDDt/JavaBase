package com.dtner.design.factory.impl;

import com.dtner.design.factory.iter.ShapIter;

/**
 * @ClassName SquareImpl
 * @Description:
 * @Author dt
 * @Date 2020-07-24
 **/
public class SquareImpl implements ShapIter {
    public void draw() {
        System.out.println("正方形");
    }
}
