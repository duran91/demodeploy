package com.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/hello-world")
    fun helloWorld() : String {
        return "Hello World"
    }

}
