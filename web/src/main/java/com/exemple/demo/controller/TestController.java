/*
 * Sébastien Leboucher
 */
package com.exemple.demo.controller;

import com.exemple.demo.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class TestController {

    private final MyService myService;

    public TestController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("publish")
    public void publish() {
    }
}
