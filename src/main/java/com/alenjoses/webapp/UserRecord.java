package com.alenjoses.webapp;

import com.alenjoses.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class UserRecord {


    @GetMapping("users")
    public List<User> retriveAllUsers(){

        return UserDaoService.findAll();
    }
    @GetMapping("users/{id}")
    public User retriveUsers(@PathVariable Integer id){


        return UserDaoService.find(id);
    }
    @PostMapping("users/add")
    public void addUser(@RequestBody User user)
    {
        System.out.println(user.toString());
        UserDaoService.saveUser(user);

    }

}
