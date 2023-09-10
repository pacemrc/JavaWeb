package com.pacemrc.javaweb.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ListenerByXML implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("=====ByXml--MyListener--contextInitialized=====");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("=====ByXml--MyListener--contextDestroyed=====");
    }
}
