package com.dtner.design.decorator.impl;

import com.dtner.design.decorator.abstr.ShapeDecoratorAbstract;
import com.dtner.design.decorator.iter.ShapeIter;

/**
 * @ClassName RedShapeDecoratorImpl
 * @Description: 
 * @Author dt
 * @Date 2020-07-31
 **/
public class RedShapeDecoratorImpl extends ShapeDecoratorAbstract {

    public RedShapeDecoratorImpl(ShapeIter decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }
    private void setRedBorder(ShapeIter decoratedShape){
        System.out.println("Border Color: Red");
    }
}
