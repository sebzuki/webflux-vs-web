/*
 * Sébastien Leboucher
 */
package com.exemple.demo.controller;

import com.exemple.demo.dao.domain.Student;
import com.exemple.demo.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/")
@RestController
public class TestController {

    private final MyService myService;

    public TestController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("load")
    public List<Student> load() {
        return myService.findStudentsByLocationAndName();
    }
}
