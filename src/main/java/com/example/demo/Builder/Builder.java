package com.example.demo.Builder;

import java.security.PublicKey;

/**
 * 抽象构建者
 */
public  class Builder {
    public IMenu levelOne(double area){
        return  new DecirationPackageMenu(area,"豪华欧式").
                appendCeiling(new LevelTwoCeiling()).
                appendCoat(new DuluxCoat())
                .appendFloor(new SXFloor());
    }
    public IMenu levelTwo(double area){
        return  new DecirationPackageMenu(area,"轻奢田园").
                appendCeiling(new LevelTwoCeiling()).
                appendCoat(new LibanCoat())
                .appendTile(new MarcolPoloTile());
    }
    public IMenu levelThree(double area){
        return  new DecirationPackageMenu(area,"现代简约").
                appendCeiling(new LevelOneCeiling()).
                appendCoat(new LibanCoat())
                .appendTile(new DPTile());
    }

}
