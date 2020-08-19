package com.dtner.design.observer.impl;

import com.dtner.design.observer.Subject;
import com.dtner.design.observer.abstr.Observer;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: "+Integer.toBinaryString(subject.getState()));
    }
}
