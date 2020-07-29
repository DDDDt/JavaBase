package com.dtner.design.prototype.impl;

import com.dtner.design.prototype.abstr.ShapeAbstract;

/**
 * @ClassName CircleImple
 * @Description: 圆形
 * @Author dt
 * @Date 2020-07-29
 **/
public class CircleImpl extends ShapeAbstract {

    public CircleImpl() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
