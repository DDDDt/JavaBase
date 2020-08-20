package com.dtner.design.nullobject;

import com.dtner.design.nullobject.abstr.AbstractCustomer;
import com.dtner.design.nullobject.impl.NullCustomer;
import com.dtner.design.nullobject.impl.RealCustomer;

public class CustomerFactory {

    public static final String[] names = {"Rob","Joe","Julie"};

    public static AbstractCustomer getCustomer(String name){
        for(int i = 0;i < names.length;i++){
            if(names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }

}
