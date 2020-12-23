package com.design23.group4Extend.mvcFramework;

import javax.servlet.*;
import java.io.IOException;
//● 工厂方法模式：通过工厂方法模式把所有的拦截器链实现出来，方便在系统初始化时直接处理。
//
//● 单例模式：Action的默认配置都是单例模式，在一般的应用中单例已经足够了，在复杂情况下可以使用享元模式提供应用性能，减少单例模式的性能隐患。
//
//● 责任链模式：建立拦截器链以及过滤器链，实现任务的链条化处理。
//
//● 迭代器模式：非常方便地遍历拦截器链内的拦截器，而不用再自己写遍历拦截器链的方法。
//
//● 中介者模式：以核心控制器为核心，其他同事类都负责为核心控制器“打工”，保证核心控制器瘦小、稳定。
//
//● 观察者模式：配置文件修改时，不用重启应用可以即刻生效，提供使用者的体验。
//
//● 桥梁模式：使不同的视图配合不同的语言文件，为终端用户展示不同的界面。
//
//● 策略模式：对XML文件的检查可以使用两种不同的策略，而且可以在测试机和开发机中使用不同的检查策略，方便系统间自由切换。
//
//● 访问者模式：在解析XML文件时，使用访问者非常方便地访问到需要的对象。
//
//● 适配器模式：把一个开发者不熟悉的对象转换为熟悉的对象，避免工具或框架对开发者的影响。
//
//● 门面模式：Action分发器负责所有的Action的分发工作，它提供了一个调用Action的唯一入口，避免外部模块深入到模型模块内部。
//
//● 代理模式：大量使用动态代理，确保了框架的智能化。

public class FilterDispatcher implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }

    @Override
    public void destroy() {

    }
}
