package com.example.demo.Observer.custom;

/**
 * 主体接口
 */
public interface Subject {
    /**
     * 增加订阅者
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除订阅者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知所有订阅者
     */
    void notifyAllObservers();
}
