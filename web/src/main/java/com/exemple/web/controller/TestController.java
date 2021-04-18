/*
 * Sébastien Leboucher
 */
package com.exemple.web.controller;

import com.exemple.web.dao.domain.Student;
import com.exemple.web.service.MyService;
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
