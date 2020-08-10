package com.dtner.design.flyweight;

import com.dtner.design.flyweight.iter.Shape;

/**
 * @ClassName FlyweightApplication
 * @Description: 享元模式
 * @Author dt
 * @Date 2020-08-10
 **/
public class FlyweightApplication {

    public static void main(String[] args) {

        Shape red = ShapeFactory.getCircle("red");
        red.draw();

    }

}
