package com.dtner.design.abstractFactory;

/**
 * @ClassName FactoryProducer
 * @Description:
 * @Author dt
 * @Date 2020-07-27
 **/
public class FactoryProducer {

    public static AbstractFactory getFactory(String choise){
        if(choise.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }else{
            return new ColorFactory();
        }
    }

}
