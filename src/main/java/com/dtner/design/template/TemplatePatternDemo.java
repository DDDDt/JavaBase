package com.dtner.design.template;

import com.dtner.design.template.impl.CricketImpl;
import com.dtner.design.template.impl.FootballImpl;

public class TemplatePatternDemo {

    public static void main(String[] args) {

        CricketImpl cricket = new CricketImpl();
        cricket.play();
        System.out.println("......");
        FootballImpl football = new FootballImpl();
        football.play();

    }

}
