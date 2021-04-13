package com.example.demo.Singleton;

/**
 * 枚举式单例
 * 调用方式:EnumSingleton.instance
 */
public enum EnumSingleton {
    instance;

    private  EnumSingleton(){}

    public void getMethod(){
        System.out.println("调用方法");
    }
}
