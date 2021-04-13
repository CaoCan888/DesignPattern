package com.example.demo.Singleton;

/**
 * 懒汉式(双重校验锁)
 * 调用方式 DLCSingleton.getInstance()
 */
public class DLCSingleton {

    private volatile  static DLCSingleton dlcSingleton;

    private DLCSingleton(){};

    public static DLCSingleton getInstance(){
        if(dlcSingleton == null){
            synchronized (DLCSingleton.class){
                if(dlcSingleton == null){
                    dlcSingleton = new DLCSingleton();
                }
            }
        }
        return dlcSingleton;
    }
}
