package com.example.demo.Observer.custom;

import java.util.ArrayList;
import java.util.List;

public class Subject3D implements Subject{

    private List<Observer> observers = new ArrayList<Observer>();

    public String msg;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if(index > -1){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyAllObservers() {
        observers.stream().forEach(x ->{
            x.updateMsg(msg);
        });
    }

    /**
     * 发布消息
     */
    public void setMsg(String msg){
        this.msg= msg;
        notifyAllObservers();
    }
}
