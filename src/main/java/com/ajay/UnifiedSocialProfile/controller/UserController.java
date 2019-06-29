package com.ajay.UnifiedSocialProfile.controller;

import com.ajay.UnifiedSocialProfile.model.User;
import com.ajay.UnifiedSocialProfile.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    @GetMapping("/codeforces/{handle}")
    public User getUserInfo(@PathVariable String handle){
        return userService.getUserInfo(handle);
    }

}
