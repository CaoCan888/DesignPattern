package com.example.demo.Observer.custom;

/**
 * 订阅者接口
 */
public interface Observer {

    /**
     * 更新信息
     * @param msg
     */
    void updateMsg(String msg);
}
