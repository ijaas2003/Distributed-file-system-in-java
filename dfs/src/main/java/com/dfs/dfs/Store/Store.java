package com.dfs.dfs.Store;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Store {
  public static final Map<String, Object> store = new ConcurrentHashMap<>();
}
