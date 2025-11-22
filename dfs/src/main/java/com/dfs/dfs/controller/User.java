package com.dfs.dfs.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class User {

  @GetMapping("/userss")
  public ResponseEntity<Map<String, Object>> getUser() {
    Map<String, Object> map = new HashMap<>();
    map.put("success", "sucess");
    return ResponseEntity.status(HttpStatus.OK).body(map);

  }
}
