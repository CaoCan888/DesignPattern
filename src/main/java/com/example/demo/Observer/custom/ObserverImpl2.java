package com.example.demo.Observer.custom;

public class ObserverImpl2 implements Observer{

    public Subject subject;

    public ObserverImpl2(Subject subject){
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void updateMsg(String msg) {
        System.out.println("ObserverImpl2 " + msg);
    }
}
