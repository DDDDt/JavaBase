package com.dtner.design.abstractFactory;

import com.dtner.design.abstractFactory.iter.ColorIter;
import com.dtner.design.factory.impl.CircleImpl;
import com.dtner.design.factory.impl.RectangleImple;
import com.dtner.design.factory.impl.SquareImpl;
import com.dtner.design.factory.iter.ShapIter;

/**
 * @ClassName ShapeFactory
 * @Description:
 * @Author dt
 * @Date 2020-07-27
 **/
public class ShapeFactory extends AbstractFactory {

    @Override
    public ColorIter getColor(String color) {
        return null;
    }

    @Override
    public ShapIter getShape(String shape) {
        if(shape == null){
            return  null;
        }
        if(shape.equalsIgnoreCase("CIRCLE")){
            return new CircleImpl();
        }else if(shape.equalsIgnoreCase("RECTANGLE")){
            return new RectangleImple();
        }else{
            return new SquareImpl();
        }
    }
}
