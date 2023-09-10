package com.pacemrc.javaweb.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "ServletByAnnotation", value = "/test/annotation/servlet")
public class ServletByAnnotation extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("=====ByAnnotation--MyHttpServlet--doGet=====");
        String msg = "/test/annotation/servlet success";
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
        System.out.println("=====ByAnnotation--MyHttpServlet--destroy=====");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("=====ByAnnotation--MyHttpServlet--init=====");
    }
}
