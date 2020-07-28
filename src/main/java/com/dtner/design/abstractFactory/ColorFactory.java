package com.dtner.design.abstractFactory;

import com.dtner.design.abstractFactory.impl.BlueColorImpl;
import com.dtner.design.abstractFactory.impl.GreenColorImpl;
import com.dtner.design.abstractFactory.impl.RedColorImpl;
import com.dtner.design.abstractFactory.iter.ColorIter;
import com.dtner.design.factory.iter.ShapIter;

/**
 * @ClassName ColorFactory
 * @Description:
 * @Author dt
 * @Date 2020-07-27
 **/
public class ColorFactory extends AbstractFactory {

    @Override
    public ColorIter getColor(String color) {
        if(color == null){
            return null;
        }

        if(color.equalsIgnoreCase("RED")){
            return new RedColorImpl();
        }else if(color.equalsIgnoreCase("GREEN")){
            return new GreenColorImpl();
        }else {
            return new BlueColorImpl();
        }

    }

    @Override
    public ShapIter getShape(String shape) {
        return null;
    }
}
