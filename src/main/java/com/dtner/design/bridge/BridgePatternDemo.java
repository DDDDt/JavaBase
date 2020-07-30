package com.dtner.design.bridge;

import com.dtner.design.bridge.impl.GreenCircleImpl;
import com.dtner.design.bridge.impl.RedCircleImpl;

/**
 * @ClassName BridgePatternDemo
 * @Description:
 * @Author dt
 * @Date 2020-07-30
 **/
public class BridgePatternDemo {

    public static void main(String[] args) {
        CircleShape redCircleShape = new CircleShape(new RedCircleImpl(),100, 100, 10);
        CircleShape greenCircleShape = new CircleShape(new GreenCircleImpl(),100, 100, 10);
        redCircleShape.draw();
        greenCircleShape.draw();

    }

}
