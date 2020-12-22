package com.design23.grop2structure.s6Bridge.standard;

public class ClientS6Standard {
    public static void main(String[] args) {
        House house = new House();
        System.out.println("-------房地产公司是这样运行的-------");
        //先找到房地产公司
        HouseCorp houseCorp = new HouseCorp(house);
        //看我怎么挣钱
        houseCorp.makeMoney();
        //山寨公司生产的产品很多，不过我只要指定产品就成了
        System.out.println("-------山寨公司是这样运行的-------");
        ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new IPod());
        shanZhaiCorp.makeMoney();
    }
}

//-------房地产公司是这样运行的-------
//生产出的房子是这样的...
//生产出的房子卖出去了...
//房地产公司赚大钱了...
//-------山寨公司是这样运行的-------
//生产出的iPod是这样的...
//生产出的iPod卖出去了...
//我赚钱呀...