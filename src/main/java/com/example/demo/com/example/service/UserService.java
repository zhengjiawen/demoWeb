package com.example.demo.com.example.service;

import com.example.demo.com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User saveUser(User user)
    {
        User saveUser =  userRepo.save(user);
        if(null == saveUser)
        {
            throw new RuntimeException("save is failed");
        }
        return saveUser;
    }

    public List<User> findAll()
    {
        List<User> list = new ArrayList<>();
        Iterable<User> iter = userRepo.findAll();
        iter.forEach(device -> {list.add(device);});
        return list;
    }

    public void deleteUser(User user)
    {
        userRepo.delete(user);
    }

    public String verifyUser(String name)
    {
        Optional<User> userOp = userRepo.findById(name);
        if(null == userOp && null == userOp.get())
        {
            return "user is exist";
        }
        return "user is not exist";
    }
}
