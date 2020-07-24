package com.dtner.design.factory.impl;

import com.dtner.design.factory.iter.ShapIter;

/**
 * @ClassName RectangleImple
 * @Description:
 * @Author dt
 * @Date 2020-07-24
 **/
public class RectangleImple implements ShapIter {

    public void draw() {
        System.out.println("长方形");
    }
}
