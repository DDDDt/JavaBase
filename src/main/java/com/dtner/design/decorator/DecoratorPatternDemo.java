package com.dtner.design.decorator;

import com.dtner.design.decorator.impl.CircleImpl;
import com.dtner.design.decorator.impl.RectangleImpl;
import com.dtner.design.decorator.impl.RedShapeDecoratorImpl;
import com.dtner.design.decorator.iter.ShapeIter;

/**
 * @ClassName DecoratorPatternDemo
 * @Description:
 * @Author dt
 * @Date 2020-07-31
 **/
public class DecoratorPatternDemo {

    public static void main(String[] args) {

        ShapeIter circle = new CircleImpl();
        RedShapeDecoratorImpl redCircle = new RedShapeDecoratorImpl(new CircleImpl());
        RedShapeDecoratorImpl redRectangle = new RedShapeDecoratorImpl(new RectangleImpl());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("Circle of red border");
        redCircle.draw();

        System.out.println("Rectangle of red border");
        redRectangle.draw();


    }

}
