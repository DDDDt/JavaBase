package com.dtner.design.vistor.impl;

import com.dtner.design.vistor.iter.ComputerPartIter;
import com.dtner.design.vistor.iter.ComputerPartVisitorIter;

public class MonitorImpl implements ComputerPartIter {

    @Override
    public void accept(ComputerPartVisitorIter computerPartVisitorIter) {
        computerPartVisitorIter.visit(this);
    }
}
