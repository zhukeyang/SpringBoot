package com.node.springboot.service;

import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    void put(String key, String value);
    String get(String key);
}
