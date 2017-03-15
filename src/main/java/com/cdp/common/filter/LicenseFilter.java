package com.cdp.common.filter;

import com.cdp.common.util.License;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by xiaohu on 2017/3/14.
 */
public class LicenseFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        String license = new License().checkLicense();

        System.out.println(license);

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
