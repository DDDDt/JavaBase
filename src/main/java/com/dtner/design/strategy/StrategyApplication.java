package com.dtner.design.strategy;

import com.dtner.design.strategy.impl.ExceptImpl;
import com.dtner.design.strategy.impl.PlusImpl;
import com.dtner.design.strategy.impl.ReduceImpl;
import com.dtner.design.strategy.impl.RideImpl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName StrategyApplication
 * @Description: 策略模式
 * @Author dt
 * @Date 2020-07-24
 **/
public class StrategyApplication {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {

        NumContext numContext = new NumContext();
        System.out.println(numContext.getNum(new PlusImpl(1),1,2));

        System.out.println(numContext.getNum(new ExceptImpl(),1,2));

        System.out.println(numContext.getNum(new ReduceImpl(),1,2));

        System.out.println(numContext.getNum(new RideImpl(),1,2));

        Class<PlusImpl> plusClass = PlusImpl.class;
        // 带有参数的构造函数的实例化方式
        Constructor<PlusImpl> constructor = plusClass.getConstructor(Integer.TYPE);
        Method method = plusClass.getMethod("num",Integer.class, Integer.class);
        System.out.println("反射得到的值 = " + method.invoke(constructor.newInstance(1),1,2));

    }

}
