package com.dtner.design.bridge;

import com.dtner.design.bridge.abstr.ShapeAbstract;
import com.dtner.design.bridge.iter.DrawApi;

/**
 * @ClassName CircleShape
 * @Description:
 * @Author dt
 * @Date 2020-07-30
 **/
public class CircleShape extends ShapeAbstract {
    private int x, y, radius;

    public CircleShape(DrawApi drawApi, int x, int y, int radius) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius, x, y);
    }
}
