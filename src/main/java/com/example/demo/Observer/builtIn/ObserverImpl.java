package com.example.demo.Observer.builtIn;

import java.util.Observable;
import java.util.Observer;

public class ObserverImpl implements Observer {

    public void register(Observable observable){
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        Subject subject = (Subject) o;
        String msg = subject.getMsg();
        System.out.println("观察到信息:  " + msg);
    }
}
