package com.dtner.design.observer;

import com.dtner.design.observer.impl.BinaryObserver;
import com.dtner.design.observer.impl.HexaObserver;
import com.dtner.design.observer.impl.OctalObserver;

public class ObserverPatternDemo {

    public static void main(String[] args) {

        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);

    }

}
