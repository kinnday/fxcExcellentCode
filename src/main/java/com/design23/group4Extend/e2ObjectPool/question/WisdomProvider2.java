package com.design23.group4Extend.e2ObjectPool.question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

//每一次访问都会直接查询数据库，没有缓存。通常情况下，这没有问题，
// 但是在高并发的情况下，例如在10万PV的压力下服务器基本就垮掉了，这是非常严重的问题。
//怎么解决呢？好办，引入一个对象池，把这5000条记录（根据评估最多不超过20000条记录）在启动时直接加载到内存中，
// 在需要时再从内存中取得，以后查询不再与数据库交互

//增加缓存后的随机读取
@Service
public class WisdomProvider2 {
    @Autowired
    private WisdomDao wisdomDao;
    private List<String> wisdoms = null;

    @PostConstruct
    public void init() {
        wisdoms = wisdomDao.getAll();
    }

    public String getOneWord() {
//        return RandomUtils.getOne(wisdoms);
        return "";
    }

}
