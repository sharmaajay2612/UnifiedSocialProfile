package com.ajay.UnifiedSocialProfile.dao;

import com.ajay.UnifiedSocialProfile.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import twitter4j.Twitter;
import twitter4j.TwitterException;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserDao {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    Twitter getTwitterInstance;

    public User getUserInfo(String handle){
       // RestTemplate restTemplate = new RestTemplate();
        User user = restTemplate.getForObject("http://codeforces.com/api/user.info?handles="+handle, User.class);
        return user;
    }

    public List<String> getTimeLine() throws TwitterException {
        Twitter twitter = getTwitterInstance;
        return twitter.getHomeTimeline().stream().map(item -> item.getText()).collect(Collectors.toList());
    }


}
