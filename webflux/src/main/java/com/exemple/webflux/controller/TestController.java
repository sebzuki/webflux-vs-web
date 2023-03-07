/*
 * Sébastien Leboucher
 */
package com.exemple.webflux.controller;

import com.exemple.webflux.dao.domain.Student;
import com.exemple.webflux.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.List;

@RequestMapping("/")
@RestController
public class TestController {
    private final MyService myService;

    public TestController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("load-mono/{id}")
    public Mono<List<Student>> loadMono(@PathVariable String id) {
        return myService.findStudentsByLocationAndNameMono(id)
                .delayElement(Duration.ofMillis(500)); // delay !!!!!!!!!
    }

    @GetMapping("load-flux")
    public Flux<Student> loadFlux() {
        return myService.findStudentsByLocationAndNameFlux();
    }
}
