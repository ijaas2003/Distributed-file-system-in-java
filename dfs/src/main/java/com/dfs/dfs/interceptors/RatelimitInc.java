package com.dfs.dfs.interceptors;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.ratelimit.ratelimit.Parser.XMLParserUtil;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class RatelimitInc implements HandlerInterceptor {
    @Autowired
    private XMLParserUtil parserUtil;

    @SuppressWarnings("null")
    @Override
    public boolean preHandle (HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        final boolean isValid = this.parserUtil.validateUrl(request.getRequestURL().toString(), request.getMethod());
        if (!isValid) {
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            response.setContentType("application/text");
            response.getWriter().println("failed");
            return false;
        }
        return true;
    }
}
