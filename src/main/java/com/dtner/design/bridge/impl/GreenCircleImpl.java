package com.dtner.design.bridge.impl;

import com.dtner.design.bridge.iter.DrawApi;

/**
 * @ClassName GreenCircleImpl
 * @Description:
 * @Author dt
 * @Date 2020-07-30
 **/
public class GreenCircleImpl implements DrawApi {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "+radius +"x = "+x+", y = "+y);
    }
}
