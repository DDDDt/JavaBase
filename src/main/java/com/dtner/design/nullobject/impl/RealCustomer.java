package com.dtner.design.nullobject.impl;

import com.dtner.design.nullobject.abstr.AbstractCustomer;

public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return null;
    }
}
