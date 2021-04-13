package com.example.demo;

import com.example.demo.Builder.Builder;
import org.junit.jupiter.api.Test;

public class BuilderTest {

    @Test
    public void test(){
        Builder builder = new Builder();
        System.out.println(builder.levelOne(117.5).getDetail());
        System.out.println(builder.levelTwo(144).getDetail());
        System.out.println(builder.levelThree(180).getDetail());
    }
}
