package com.dtner.design.proxy.impl;

import com.dtner.design.proxy.iter.Image;

/**
 * @ClassName RealImage
 * @Description:
 * @Author dt
 * @Date 2020-08-10
 **/
public class RealImage implements Image {

    private String fileName;

    public RealImage() {
    }

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("displaying ");
    }

    private void loadFormDisk(String fileName){
        System.out.println("Loading "+fileName);
    }

}
