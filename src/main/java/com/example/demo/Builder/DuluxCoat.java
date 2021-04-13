package com.example.demo.Builder;

import java.math.BigDecimal;

public class DuluxCoat implements  Matter{
    @Override
    public String scene() {
        return "涂料";
    }

    @Override
    public String brand() {
        return "多乐士(DuluxCoat)";
    }

    @Override
    public String model() {
        return "第二代";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(719);
    }

    @Override
    public String desc() {
        return "*************多乐士***************";
    }
}
