package com.dtner.design.prototype;

import com.dtner.design.prototype.abstr.ShapeAbstract;
import com.dtner.design.prototype.impl.CircleImpl;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @ClassName ShapeCache
 * @Description:
 * @Author dt
 * @Date 2020-07-29
 **/
public class ShapeCache {

    private static Map<String, ShapeAbstract> shapeMap = new HashMap<>();

    public static ShapeAbstract getShape(String shapeId){
        ShapeAbstract shape = shapeMap.get(shapeId);
        return (ShapeAbstract) shape.clone();
    }

    public static void loadCache(){
        CircleImpl circle = new CircleImpl();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);
    }

}
