package com.dtner.design.state.impl;

import com.dtner.design.state.Context;
import com.dtner.design.state.iter.State;

public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }

}
