package com.dtner.design.factory;

import com.dtner.design.factory.iter.ShapIter;

/**
 * @ClassName FactoryApplication
 * @Description:
 * @Author dt
 * @Date 2020-07-24
 **/
public class FactoryApplication {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        ShapIter shape = shapeFactory.getShape("CIRCLE");
        shape.draw();

    }

}
