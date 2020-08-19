package com.dtner.design.state;

import com.dtner.design.state.impl.StartState;
import com.dtner.design.state.impl.StopState;

public class StatePatternDemo {

    public static void main(String[] args) {

        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());

    }

}
