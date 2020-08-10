package com.dtner.design.proxy;

import com.dtner.design.proxy.impl.RealImage;
import com.dtner.design.proxy.iter.Image;

/**
 * @ClassName ImageProxy
 * @Description: 代理类
 * @Author dt
 * @Date 2020-08-10
 **/
public class ImageProxy implements Image {

    private RealImage realImage;

    private String fileName;

    public ImageProxy() {
    }

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
