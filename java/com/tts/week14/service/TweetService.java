package com.tts.week14.service;

import com.tts.week14.model.Tweet;
import com.tts.week14.model.User;


import java.util.List;


    public interface TweetService {
        List<Tweet> findAll();
        List<Tweet> findAllByUser(User user);
        List<Tweet> findAllByUsers(List<User> users);
        void save(Tweet tweet);

}
