package com.dtner.design.facade;

import com.dtner.design.facade.iter.Shape;

/**
 * @ClassName ShapeMaker
 * @Description: 外观类
 * @Author dt
 * @Date 2020-08-10
 **/
public class ShapeMaker {

    private Shape circle;

    private Shape square;

    public ShapeMaker() {
    }

    public ShapeMaker(Shape circle, Shape square) {
        this.circle = circle;
        this.square = square;
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        square.draw();
    }

}
