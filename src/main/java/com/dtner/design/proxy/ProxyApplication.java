package com.dtner.design.proxy;

/**
 * @ClassName ProxyApplication
 * @Description:
 * @Author dt
 * @Date 2020-08-10
 **/
public class ProxyApplication {

    public static void main(String[] args) {

        ImageProxy image = new ImageProxy("test.jpg");
        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();


    }

}
