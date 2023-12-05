package com.springjava.prueba.controllers;

import com.springjava.prueba.models.UserModel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @RequestMapping(value = "users/{id}")
    public UserModel getUser(@PathVariable Long id) {
        UserModel user = new UserModel();

        user.setId(id);
        user.setName("John");
        user.setLastname("Doe");
        user.setEmail("John@gmail.com");
        user.setPhone("12345678");

        return user;
    }

    @RequestMapping(value = "users")
    public List<UserModel> getUsers() {
        List<UserModel> user = new ArrayList<>();

        UserModel user1 = new UserModel();
        user1.setId(1L);
        user1.setName("John");
        user1.setLastname("Doe");
        user1.setEmail("John@gmail.com");
        user1.setPhone("12345678");

        UserModel user2 = new UserModel();
        user2.setId(2L);
        user2.setName("John");
        user2.setLastname("Doe");
        user2.setEmail("John@gmail.com");
        user2.setPhone("12345678");

        UserModel user3 = new UserModel();
        user3.setId(3L);
        user3.setName("John2");
        user3.setLastname("Doe");
        user3.setEmail("John@gmail.com");
        user3.setPhone("12345678");

        user.add(user1);
        user.add(user2);
        user.add(user3);
        return user;
    }

    @RequestMapping(value = "users3")
    public UserModel putUser() {
        UserModel user = new UserModel();
        user.setName("John3");
        user.setLastname("Doe");
        user.setEmail("John@gmail.com");
        user.setPhone("12345678");

        return user;
    }

    @RequestMapping(value = "users2")
    public UserModel deleteUser() {
        UserModel user = new UserModel();
        user.setName("John");
        user.setLastname("Doe");
        user.setEmail("John@gmail.com");
        user.setPhone("12345678");

        return user;
    }

    @RequestMapping(value = "users1")
    public UserModel searchUser() {
        UserModel user = new UserModel();
        user.setName("John");
        user.setLastname("Doe");
        user.setEmail("John@gmail.com");
        user.setPhone("12345678");

        return user;
    }
}
