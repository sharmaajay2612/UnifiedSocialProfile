package com.ajay.UnifiedSocialProfile.dao;

import com.ajay.UnifiedSocialProfile.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UserDao {
    @Autowired
    private RestTemplate restTemplate;

    public User getUserInfo(String handle){
       // RestTemplate restTemplate = new RestTemplate();
        User user = restTemplate.getForObject("http://codeforces.com/api/user.info?handles="+handle, User.class);
        return user;
    }

}
