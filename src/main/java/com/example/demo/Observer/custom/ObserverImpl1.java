package com.example.demo.Observer.custom;

public class ObserverImpl1 implements Observer{

    public Subject subject;

    public ObserverImpl1(Subject subject){
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void updateMsg(String msg) {
        System.out.println("ObserverImpl1 " + msg);
    }
}
