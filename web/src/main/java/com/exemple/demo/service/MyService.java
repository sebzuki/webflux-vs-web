/*
 * Sébastien Leboucher
 */
package com.exemple.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MyService {
    private final RestTemplate repository;

    public MyService(RestTemplate repository) {
        this.repository = repository;
    }

    public void load() {

    }
}
