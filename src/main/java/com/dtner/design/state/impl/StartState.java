package com.dtner.design.state.impl;

import com.dtner.design.state.Context;
import com.dtner.design.state.iter.State;

public class StartState implements State {

    @Override
    public void doAction(Context context){
        System.out.println("player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }

}
