package com.dtner.design.abstractFactory;

import com.dtner.design.abstractFactory.iter.ColorIter;
import com.dtner.design.factory.iter.ShapIter;

/**
 * @ClassName AbstractFactory
 * @Description: 抽象工厂类
 * @Author dt
 * @Date 2020-07-27
 **/
public abstract class AbstractFactory {

    public abstract ColorIter getColor(String color);

    public abstract ShapIter getShape(String shape);

}
