package com.dtner.design.bridge.impl;

import com.dtner.design.bridge.iter.DrawApi;

/**
 * @ClassName RedCircle
 * @Description: 红色圆
 * @Author dt
 * @Date 2020-07-30
 **/
public class RedCircleImpl implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "+radius +"x = "+x+", y = "+y);
    }
}
