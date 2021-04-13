package com.example.demo.Builder;

import java.math.BigDecimal;

public class DPTile implements  Matter{
    @Override
    public String scene() {
        return "地砖";
    }

    @Override
    public String brand() {
        return "东鹏(DPTile)";
    }

    @Override
    public String model() {
        return "1001";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(102);
    }

    @Override
    public String desc() {
        return "*************东鹏地砖***************";
    }
}
