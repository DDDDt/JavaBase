package com.dtner.design.strategy;

import com.dtner.design.strategy.iter.NumIter;

/**
 * @ClassName NumContext
 * @Description: 策略类实现方式
 * @Author dt
 * @Date 2020-07-24
 **/
public class NumContext {

    public Integer getNum(NumIter numIter,Integer i,Integer n){
        return numIter.num(i,n);
    }

}
