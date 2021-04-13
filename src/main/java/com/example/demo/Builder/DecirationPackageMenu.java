package com.example.demo.Builder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DecirationPackageMenu implements IMenu{

    // 装修清单
    private List<Matter> list = new ArrayList<Matter>();

    // 装修价格
    private BigDecimal price = BigDecimal.ZERO;

    //房屋面积
    private BigDecimal area;

    //等级
    private String grade;

    private DecirationPackageMenu(){}

    public DecirationPackageMenu(Double area,String grade){
        this.area = new BigDecimal(area);
        this.grade = grade;
    }

    @Override
    public IMenu appendCeiling(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(new BigDecimal(0.2)).multiply(matter.price()));
        return this;
    }

    @Override
    public IMenu appendCoat(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(new BigDecimal(1.4)).multiply(matter.price()));
        return this;
    }

    @Override
    public IMenu appendFloor(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(matter.price()));
        return this;
    }

    @Override
    public IMenu appendTile(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(matter.price()));
        return this;
    }

    @Override
    public String getDetail() {
        StringBuilder detail = new StringBuilder("\r\n------------------------------------------------\r\n"+
                "装修清单"+"\r\n"+
                "装修等级"+grade+"\r\n"+
                "装修价格"+price.setScale(2,BigDecimal.ROUND_HALF_UP) + "元\r\n"+
                "房屋面积"+area.doubleValue()+"平米\r\n"+
                "材料清单"+"\r\n");
        list.stream().forEach(x->{
            detail.append(x.scene()).append("! ").append(x.brand()).append(", ").append(x.model()).append(", 平米价格: ").append(x.price()).append("元 \r\n");
        });
        return detail.toString();
    }
}
