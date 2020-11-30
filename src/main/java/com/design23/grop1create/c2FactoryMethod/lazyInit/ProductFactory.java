package com.design23.grop1create.c2FactoryMethod.lazyInit;

import com.design23.grop1create.c2FactoryMethod.HumanBlack;
import com.design23.grop1create.c2FactoryMethod.HumanWhite;

import java.util.HashMap;
import java.util.Map;

// 变种4： 延迟初始化
//通过prMap变量产生一个缓存，对需要再次被重用的对象保留
public class ProductFactory {
    private static final Map<String,Object> cache = new HashMap();

    public static synchronized Object createProduct(String type) throws Exception{
        Object rst = null;
        if(cache.containsKey(type)){
            rst = cache.get(type);
        }else {
            if(type.equals("type1")){
                rst = new HumanWhite();
            }else {
                rst = new HumanBlack();
            }
            cache.put(type,rst);
        }
        return rst;
    }
}
