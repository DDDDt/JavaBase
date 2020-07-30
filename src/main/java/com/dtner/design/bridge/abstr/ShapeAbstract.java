package com.dtner.design.bridge.abstr;

import com.dtner.design.bridge.iter.DrawApi;

/**
 * @ClassName ShapeAbstract
 * @Description:
 * @Author dt
 * @Date 2020-07-30
 **/
public abstract class ShapeAbstract {
    protected DrawApi drawApi;

    protected ShapeAbstract(DrawApi drawApi){
        this.drawApi = drawApi;
    }

    public abstract void draw();

}
