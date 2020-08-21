package com.dtner.design.vistor.impl;

import com.dtner.design.vistor.iter.ComputerPartIter;
import com.dtner.design.vistor.iter.ComputerPartVisitorIter;

public class ComputerImpl implements ComputerPartIter {

    ComputerPartIter[] parts;

    public ComputerImpl() {
        this.parts = new ComputerPartIter[]{new MouseImpl(),new KeyboardImpl(),new MonitorImpl()};
    }

    @Override
    public void accept(ComputerPartVisitorIter computerPartVisitorIter) {
        for (ComputerPartIter part : parts) {
            part.accept(computerPartVisitorIter);
        }
        computerPartVisitorIter.visit(this);
    }
}
