package com.example.demo.Factory.FactoryMethod;

import com.example.demo.Factory.RouJiaMo;

/**
 * Created by jingbin on 2016/10/24.
 * 西安肉夹馍店   让分店自己去卖自己口味的肉夹馍
 */

public class XianRoujiaMoStore extends RoujiaMoStore {

    private XianSimpleRoujiaMoFactory factory;

    public XianRoujiaMoStore(XianSimpleRoujiaMoFactory factory) {
        this.factory = factory;
    }

    @Override
    public RouJiaMo sellRoujiaMo(String type) {

        RouJiaMo roujiaMo = factory.creatRoujiaMo(type);
        roujiaMo.prepare();
        roujiaMo.fire();
        roujiaMo.pack();
        return roujiaMo;
    }
}
