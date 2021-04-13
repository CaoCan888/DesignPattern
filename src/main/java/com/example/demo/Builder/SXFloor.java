package com.example.demo.Builder;

import java.math.BigDecimal;

public class SXFloor implements  Matter{
    @Override
    public String scene() {
        return "地板";
    }

    @Override
    public String brand() {
        return "圣象(SXFloor)";
    }

    @Override
    public String model() {
        return "一般";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(318);
    }

    @Override
    public String desc() {
        return "*************圣象地板***************";
    }
}
