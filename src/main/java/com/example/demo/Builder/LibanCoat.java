package com.example.demo.Builder;

import java.math.BigDecimal;

public class LibanCoat implements  Matter{
    @Override
    public String scene() {
        return "涂料";
    }

    @Override
    public String brand() {
        return "立邦(LibanCoat)";
    }

    @Override
    public String model() {
        return "默认级别";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(650);
    }

    @Override
    public String desc() {
        return "*************立邦***************";
    }
}
