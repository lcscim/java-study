package com.lcscim.study.servlet;

import javax.servlet.*;
import java.io.IOException;

public class ServletDemo1 implements Servlet {
    @java.lang.Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @java.lang.Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @java.lang.Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Hello Servlet...");
    }

    @java.lang.Override
    public java.lang.String getServletInfo() {
        return null;
    }

    @java.lang.Override
    public void destroy() {

    }
}
