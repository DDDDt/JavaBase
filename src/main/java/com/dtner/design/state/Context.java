package com.dtner.design.state;

import com.dtner.design.state.iter.State;

public class Context {

    private State state;

    public Context() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
