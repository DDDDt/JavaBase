package com.dtner.design.observer.abstr;

import com.dtner.design.observer.Subject;

public abstract class Observer {

    public Subject subject;

    public abstract void update();

}
