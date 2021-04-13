package com.example.demo.Observer.builtIn;

import java.util.Observable;

public class Subject extends Observable {
    public String msg = "";

    public String getMsg(){
        return msg;
    }

    public  void setMsg(String msg){
        this.msg = msg;
        setChanged();
        notifyObservers();
    }
}
