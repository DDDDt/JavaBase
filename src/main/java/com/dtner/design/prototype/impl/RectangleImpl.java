package com.dtner.design.prototype.impl;

import com.dtner.design.prototype.abstr.ShapeAbstract;

/**
 * @ClassName RectangleImpl
 * @Description: 矩形
 * @Author dt
 * @Date 2020-07-29
 **/
public class RectangleImpl extends ShapeAbstract {
    public RectangleImpl() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle");
    }
}
