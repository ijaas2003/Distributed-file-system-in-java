package com.dfs.dfs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
  "com.dfs.dfs",
  "com.ratelimit.ratelimit",
  "com.dfs.dfs.GRPC_Configuration"
})
public class DfsApplication {
  public static void main(String[] args) {
    SpringApplication.run(DfsApplication.class, args);
  }
}
