package com.dtner.design.template.impl;

import com.dtner.design.template.abstr.Game;

public class FootballImpl extends Game {

    @Override
    public void initialize() {
        System.out.println("Football Game Init");
    }

    @Override
    public void startPlay() {
        System.out.println("Football Game Start");
    }

    @Override
    public void endPlay() {
        System.out.println("Foorball Game End");
    }
}
