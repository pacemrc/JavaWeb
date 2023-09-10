package com.pacemrc.javaweb.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletByXML extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("=====ByXml--MyHttpServlet--doGet=====");
        String msg = "/test/xml/servlet success";
        resp.getWriter().write(msg);
        resp.getWriter().flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }

    @Override
    public void destroy() {
        System.out.println("=====ByXml--MyHttpServlet--destroy=====");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("=====ByXml--MyHttpServlet--init=====");
    }
}
