package com.company.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAll(){
        return userRepository.getAll();
    }

    public User add(User user){
        return  userRepository.add(user);
    }
}
