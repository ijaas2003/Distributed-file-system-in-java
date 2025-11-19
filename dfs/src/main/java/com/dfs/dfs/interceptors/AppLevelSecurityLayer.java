package com.dfs.dfs.interceptors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppLevelSecurityLayer implements WebMvcConfigurer {

  @Autowired
  public RatelimitInc rateLimiterInterceptor;

  @Autowired
  public UserInterceptors userInterceptors;

  @SuppressWarnings("null")
  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(userInterceptors);
    registry.addInterceptor(rateLimiterInterceptor);
  }
}
