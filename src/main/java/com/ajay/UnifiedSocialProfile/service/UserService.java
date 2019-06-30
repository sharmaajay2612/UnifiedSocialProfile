package com.ajay.UnifiedSocialProfile.service;

import com.ajay.UnifiedSocialProfile.dao.UserDao;
import com.ajay.UnifiedSocialProfile.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import twitter4j.TwitterException;
import twitter4j.api.UsersResources;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User getUserInfo(String handle){
        return userDao.getUserInfo(handle);
    }

    public List<String> showTimeline() throws TwitterException
    {
        return userDao.getTimeLine();
    }

    public UsersResources showUser() throws TwitterException
    {
        return userDao.getUser();
    }
}
