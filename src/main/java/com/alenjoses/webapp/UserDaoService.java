package com.alenjoses.webapp;

import com.alenjoses.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.*;

@Component
public class UserDaoService {

    private static ArrayList<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "Alen", LocalDate.now().minusYears(30)));
        users.add(new User(2, "Max", LocalDate.now().minusYears(25)));
        users.add(new User(3, "Jack", LocalDate.now().minusYears(20)));
    }

    static List<User> findAll(){
        return users;
    }

    static User find(Integer id)
    {
        int length = users.size();
        System.out.println("Lenght :" + length);
        System.out.println(users);
        for (int index = 0; index < length; index++)
        {
            if (Objects.equals(users.get(index).getId(), id))
            {
                System.out.println(users.get(index));
                return users.get(index);
            }
        }


        return null;
    }

    static User saveUser(User user){
        System.out.println(users.size());
        System.out.println(user.getId());
        int val = users.size();
        user.setId(val+1);
        System.out.println(user.getId());
        users.add(user);
        return user;
    }



}
