package com.example.demo.Builder;

import java.math.BigDecimal;

public class DerFloor implements  Matter{
    @Override
    public String scene() {
        return "地板";
    }

    @Override
    public String brand() {
        return "德尔(DerFloor)";
    }

    @Override
    public String model() {
        return "A+";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(119);
    }

    @Override
    public String desc() {
        return "*************德尔地板***************";
    }
}
