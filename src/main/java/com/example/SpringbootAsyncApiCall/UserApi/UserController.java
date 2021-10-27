package com.example.SpringbootAsyncApiCall.UserApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController
{
    @Autowired
    private UserService userService;
    @GetMapping
    public ResponseEntity fetchAllUser(){
        return new ResponseEntity(userService.getAllUser(), HttpStatus.OK);
    }
}