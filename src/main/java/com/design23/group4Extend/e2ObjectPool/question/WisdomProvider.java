package com.design23.group4Extend.e2ObjectPool.question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//无缓存的SQL随机读取
@Service
public class WisdomProvider {
    @Autowired
    private WisdomDao wisdomDao;

    public String getOneWord() {
        return wisdomDao.randomOneWisdom();
    }
}
