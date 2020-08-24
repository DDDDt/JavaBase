package com.dtner.design.decorator.abstr;

import com.dtner.design.decorator.iter.ShapeIter;

/**
 * @ClassName ShapeDecorator
 * @Description: 抽象类
 * @Author dt
 * @Date 2020-07-31
 **/
public abstract class ShapeDecoratorAbstract implements ShapeIter {

    protected ShapeIter decoratedShape;

    public ShapeDecoratorAbstract(ShapeIter decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
