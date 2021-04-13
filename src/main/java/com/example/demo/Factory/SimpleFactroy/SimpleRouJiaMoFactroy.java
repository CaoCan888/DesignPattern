package com.example.demo.Factory.SimpleFactroy;

import com.example.demo.Factory.LaRouJiaMo;
import com.example.demo.Factory.RouJiaMo;
import com.example.demo.Factory.SuanRouJiaMo;
import com.example.demo.Factory.TianRouJiaMo;

/**
 * 肉夹馍工厂
 * 根据不同类型传参生成不同类型的肉夹馍实例
 */
public class SimpleRouJiaMoFactroy {
    public RouJiaMo createRouJiaMo(String type)
    {
        RouJiaMo rouJiaMo = null;
        if (type.equals("Suan"))
        {
            rouJiaMo = new SuanRouJiaMo();

        } else if (type.equals("Tian"))
        {
            rouJiaMo = new TianRouJiaMo();
        } else if (type.equals("La"))
        {
            rouJiaMo = new LaRouJiaMo();
        }
        return rouJiaMo;
    }

}
