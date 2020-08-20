package com.dtner.design.template.impl;

import com.dtner.design.template.abstr.Game;

public class CricketImpl extends Game {

    @Override
    public void initialize() {
        System.out.println("Cricket Game Init");
    }

    @Override
    public void startPlay() {
        System.out.println("Cricket Game Start");
    }

    @Override
    public void endPlay() {
        System.out.println("Cricket Game End");
    }
}
