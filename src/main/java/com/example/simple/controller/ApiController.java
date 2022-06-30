package com.example.simple.controller;

import com.example.simple.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/simple")
    public UserDto simpleTest(UserDto userDto) {
        return userDto;
    }
}
