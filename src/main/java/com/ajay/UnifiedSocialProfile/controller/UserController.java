package com.ajay.UnifiedSocialProfile.controller;

import com.ajay.UnifiedSocialProfile.model.User;
import com.ajay.UnifiedSocialProfile.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import twitter4j.TwitterException;
import twitter4j.api.UsersResources;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/codeforces/{handle}")
    public User getUserInfo(@PathVariable String handle){
        return userService.getUserInfo(handle);
    }

    @GetMapping("/twitterTimeline")
    public List<String> getUserTimeline() throws TwitterException
    {
        return userService.showTimeline();
    }

    @GetMapping("/twitterUser")
    public UsersResources getTwitterUserInfo() throws TwitterException
    {
        return userService.showUser();
    }

}

