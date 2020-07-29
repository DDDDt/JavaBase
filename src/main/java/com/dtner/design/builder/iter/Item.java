package com.dtner.design.builder.iter;

import java.math.BigDecimal;

/**
 * @InterfaceName Item
 * @Description: item 接口
 * @Author dt
 * @Date 2020-07-29
 **/
public interface Item {

    String name();

    Packing packing();

    BigDecimal price();

}
