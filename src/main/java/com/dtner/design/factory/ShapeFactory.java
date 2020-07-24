package com.dtner.design.factory;

import com.dtner.design.factory.impl.CircleImpl;
import com.dtner.design.factory.impl.RectangleImple;
import com.dtner.design.factory.impl.SquareImpl;
import com.dtner.design.factory.iter.ShapIter;

/**
 * @ClassName ShapeFactory
 * @Description: 工厂类
 * @Author dt
 * @Date 2020-07-24
 **/
public class ShapeFactory {

    public ShapIter getShape(String shapeType){

        if(shapeType == null){
            return null;
        }

        switch (shapeType){
            case "CIRCLE":
                return new CircleImpl();
            case "RECTANGLE":
                return new RectangleImple();
            default:
                return new SquareImpl();
        }

    }

}
