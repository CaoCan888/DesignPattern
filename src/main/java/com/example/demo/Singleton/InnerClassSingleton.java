package com.example.demo.Singleton;

/**
 * 内部类单例
 * 调用方式: InnerClassSingleton.getInstance();
 */
public class InnerClassSingleton {

    private InnerClassSingleton(){}

    private static class InnerClassSingletonHandle{
        private static   InnerClassSingleton innerClassSingleton = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance(){
        return InnerClassSingletonHandle.innerClassSingleton;
    }
}
