package com.dtner.design.observer.impl;

import com.dtner.design.observer.Subject;
import com.dtner.design.observer.abstr.Observer;

public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: "+ Integer.toHexString(subject.getState()).toUpperCase());
    }
}
