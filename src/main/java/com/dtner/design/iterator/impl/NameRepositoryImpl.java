package com.dtner.design.iterator.impl;

import com.dtner.design.iterator.iter.Container;
import com.dtner.design.iterator.iter.Iterator;

public class NameRepositoryImpl implements Container {

    public String names[] = {"Robert", "John","Julie","Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterato();
    }

    private class NameIterato implements Iterator{

        int index;

        @Override
        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
