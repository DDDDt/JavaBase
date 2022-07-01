package com.dtner.nanoid;

import cn.hutool.core.lang.id.NanoId;

/**
 * @program: Java-Base
 * @description: 生成 nanoid
 * @author: dt
 * @create: 2022-06-17
 **/
public class CreateNanoid {

    public static void main(String[] args) {

        String nanoId = NanoId.randomNanoId(10);

        System.out.println(nanoId);

    }

}
