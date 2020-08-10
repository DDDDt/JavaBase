package com.dtner.design.flyweight;

import com.dtner.design.flyweight.impl.CircleImpl;
import com.dtner.design.flyweight.iter.Shape;

import java.util.HashMap;

/**
 * @ClassName ShapeFactory
 * @Description:
 * @Author dt
 * @Date 2020-08-10
 **/
public class ShapeFactory {

    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color){
        Shape shape = circleMap.get(color);
        if(shape == null){
            shape = new CircleImpl(color);
            circleMap.put(color,shape);
        }
        return shape;
    }

}
