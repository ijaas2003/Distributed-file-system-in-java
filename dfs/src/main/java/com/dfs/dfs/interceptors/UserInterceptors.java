package com.dfs.dfs.interceptors;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.ratelimit.ratelimit.ThreadLocal.UserThread;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class UserInterceptors implements HandlerInterceptor {

  @SuppressWarnings("null")
  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
    Cookie[] cookies = request.getCookies();
    System.out.println("Interceptor => " + request.getRequestURI());

    if (cookies == null) {
      return false;
    }
    UserThread.setUserId(cookies[0].getName());
    return true;
  }
}
