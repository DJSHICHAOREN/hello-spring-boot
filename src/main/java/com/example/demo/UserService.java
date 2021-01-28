package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void insertTwo(){
        User user1 = new User();
        user1.setName("xxkl");
        user1.setAge(26);
        userRepository.save(user1);

        User user2 = new User();
        user2.setName("asdfasdfasasdfsadfdfasdfasfdasdfasd");
        user2.setAge(29);
        userRepository.save(user2);
    }
}
