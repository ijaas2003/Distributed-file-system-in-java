package com.dfs.dfs.Configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class RedisConfiguration {

  @Value("${spring.redis.host}")
  private String host;

  @Value("${spring.redis.port}")
  private int port;

  @Value("${spring.redis.timeout}")
  private int timeout;

    @Bean
    JedisPool jedisPoolConf() {
    JedisPoolConfig jedisPool = new JedisPoolConfig();
    jedisPool.setMaxIdle(20);
    jedisPool.setMinIdle(2);
    jedisPool.setBlockWhenExhausted(true);

    return new JedisPool(jedisPool, host, port, timeout);
  }
}
