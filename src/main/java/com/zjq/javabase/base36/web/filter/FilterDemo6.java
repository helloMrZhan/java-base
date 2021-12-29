package com.zjq.javabase.base36.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class FilterDemo6 implements Filter {

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("filterDemo6执行了...");

        chain.doFilter(req, resp);

        System.out.println("filterDemo6回来了...");
    }
    @Override
    public void init(FilterConfig config) throws ServletException {

    }
    @Override
    public void destroy() {
    }

}
