package com.dtner.design.abstractFactory;

import com.dtner.design.abstractFactory.iter.ColorIter;
import com.dtner.design.factory.iter.ShapIter;

/**
 * @ClassName AbstractFactoryPatternDemo
 * @Description:
 * @Author dt
 * @Date 2020-07-27
 **/
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        // 获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        // 获取形状为 Circle 的对象
        ShapIter shapIter = shapeFactory.getShape("CIRCLE");
        shapIter.draw();

        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //获取颜色为 Red 的对象
        ColorIter color = colorFactory.getColor("RED");

        //调用 Red 的 fill 方法
        color.fill();

    }

}
