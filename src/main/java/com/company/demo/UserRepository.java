package com.company.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

//    INSERT INTO `database`.`user` (`name`) VALUES ('mihail2');
//    select last_insert_id();


    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<User> getAll(){
        return null;
    }

    public User add(User user){
        return null;
    }
}
