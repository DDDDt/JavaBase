package com.dtner.design.vistor.impl;

import com.dtner.design.vistor.iter.ComputerPartIter;
import com.dtner.design.vistor.iter.ComputerPartVisitorIter;

public class ComputerPartDisplayVisitorImpl implements ComputerPartVisitorIter {

    @Override
    public void visit(ComputerPartIter computerPartIter) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(MouseImpl mouse) {
        System.out.println("Displaying Mouse");
    }

    @Override
    public void visit(KeyboardImpl keyboard) {
        System.out.println("Displaying Keyboard");
    }

    @Override
    public void visit(MonitorImpl monitor) {
        System.out.println("Displaying Monitor");
    }
}
