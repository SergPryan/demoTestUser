package com.company.demo;

import com.company.demo.DbSchema.UserTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserRepository {

//    INSERT INTO `database`.`user` (`name`) VALUES ('mihail2');
//    select last_insert_id();


    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<User> getAll(){
        List<User>  result = jdbcTemplate.query("SELECT * FROM " + UserTable.Name,
                new RowMapper<User>() {
                    @Override
                    public User mapRow(ResultSet resultSet, int i) throws SQLException {
                        User user = new User(resultSet.getLong(UserTable.Cols.ID),resultSet.getString(UserTable.Cols.NAME));
                        return user;
                    }
                });
        return result;
    }

    public void add(User user){
        int a=  jdbcTemplate.update("INSERT  INTO " + UserTable.Name +
                "("+UserTable.Cols.NAME+") VALUES (?,?); SELECT LAST_INSERT_ID();",user.getName() );
        System.out.println(a);
    }
}
