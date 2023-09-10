package com.pacemrc.javaweb.filter;


import javax.servlet.*;
import java.io.IOException;


public class FilterByXML implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("=====ByXml--MyFilter--init=====");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("=====ByXml--MyFilter--doFilter=====");
        servletRequest.setCharacterEncoding("UTF-8");
        servletResponse.setCharacterEncoding("UTF-8");
        filterChain.doFilter(servletRequest,servletResponse);
//        System.out.println("servlet调用完了");
    }

    @Override
    public void destroy() {
        System.out.println("=====ByXml--MyFilter--destroy=====");
    }
}
