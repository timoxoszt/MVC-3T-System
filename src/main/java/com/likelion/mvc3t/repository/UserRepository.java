package com.likelion.mvc3t.repository;

import com.likelion.mvc3t.model.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
@Component
public class UserRepository {
    ArrayList<User> users = new ArrayList<User>();
    @PostConstruct
    public void GenerateUser(){
        users.add(new User("1", "Minh Tien", "20", "Java"));
        users.add(new User("2", "Tien Minh", "11", "PHP"));
        users.add(new User("3", "Vi Minh", "18", "Python"));
        users.add(new User("4", "Tien Vi", "15", "Golang"));
        users.add(new User("5", "Vi Tien", "24", "ASM"));
    }

    public List<User> listUsers()
    {
        return users;
    }
    public User showUser(String id){
        for (User user : users) {
            if (id.equals(user.getId())) {
                return new User(user.getId(), user.getTen(), user.getTuoi(), user.getSothich());
            }
        }
        return null;
    }
}
