package com.pacemrc.javaweb.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener(value = "/test/annotation/listener")
public class ListenerByAnnotation implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("=====ByAnnotation--MyListener--contextInitialized=====");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("=====ByAnnotation--MyListener--contextDestroyed=====");
    }
}
