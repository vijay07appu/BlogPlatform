package com.blogPlatform.BlogPlatform.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControllers {

    @PostMapping("/public/register")
    public ResponseEntity<String> register(@RequestBody )
}
