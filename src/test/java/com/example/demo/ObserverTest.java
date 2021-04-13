package com.example.demo;

import com.example.demo.Observer.builtIn.ObserverImpl;
import com.example.demo.Observer.builtIn.Subject;
import com.example.demo.Observer.custom.Observer;
import com.example.demo.Observer.custom.ObserverImpl1;
import com.example.demo.Observer.custom.ObserverImpl2;
import com.example.demo.Observer.custom.Subject3D;
import org.junit.jupiter.api.Test;

public class ObserverTest {

    @Test
    public void custom(){
        Subject3D subject = new Subject3D();
        Observer observer1 = new ObserverImpl1(subject);
        Observer observer2 = new ObserverImpl2(subject);
        subject.setMsg("发布消息了!");
    }

    @Test
    public void builtIn(){
        Subject subject = new Subject();
        ObserverImpl observer = new ObserverImpl();
        observer.register(subject);
        subject.setMsg("发布消息了!");
    }
}

