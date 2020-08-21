package com.dtner.design.vistor.iter;

import com.dtner.design.vistor.impl.KeyboardImpl;
import com.dtner.design.vistor.impl.MonitorImpl;
import com.dtner.design.vistor.impl.MouseImpl;

/**
 *访问者的接口
 */
public interface ComputerPartVisitorIter {
    public void visit(ComputerPartIter computerPartIter);

    public void visit(MouseImpl mouse);

    public void visit(KeyboardImpl keyboard);

    public void visit(MonitorImpl monitor);
}
