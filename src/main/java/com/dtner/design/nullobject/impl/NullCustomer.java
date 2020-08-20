package com.dtner.design.nullobject.impl;

import com.dtner.design.nullobject.abstr.AbstractCustomer;

public class NullCustomer extends AbstractCustomer {

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
