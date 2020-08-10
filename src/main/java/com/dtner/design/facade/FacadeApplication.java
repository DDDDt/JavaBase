package com.dtner.design.facade;

/**
 * @ClassName FacadeApplication
 * @Description: 外观模式程序入口类
 * @Author dt
 * @Date 2020-08-10
 **/
public class FacadeApplication {

    public static void main(String[] args) {

        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();

    }

}
