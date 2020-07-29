package com.dtner.design.prototype.impl;

import com.dtner.design.prototype.abstr.ShapeAbstract;

/**
 * @ClassName SquareAbstract
 * @Description: 正方形
 * @Author dt
 * @Date 2020-07-29
 **/
public class SquareImpl extends ShapeAbstract {

    public SquareImpl(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Square");
    }
}
