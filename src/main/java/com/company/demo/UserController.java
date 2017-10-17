package com.company.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {


    @GetMapping
    public ResponseEntity<List<User>> getAll(){
        return null;
    }

    @PostMapping
    public ResponseEntity<User> add(){
        return null;
    }


}
