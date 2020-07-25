package com.tugas5.wisnufebriramadhan.controller;

import com.tugas5.wisnufebriramadhan.model.UserModel;
import com.tugas5.wisnufebriramadhan.repository.UserRepository;
import com.tugas5.wisnufebriramadhan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @GetMapping
    public List<UserModel> getAllUser(@RequestParam(value = "page", defaultValue = "0") Integer pageNo,
                                      @RequestParam(value = "sortKey", defaultValue = "username") String sortKey) {
        return userService.getAllUser(pageNo, sortKey);
    }


    @PostMapping("/create")
    public UserModel createUser(@RequestBody UserModel body) {
        UserModel result = userRepository.save(body);
        return result;
    }

    @DeleteMapping("/delete")
    public String deleteById(@RequestParam String id){
        userService.deleteById(id);
        return id;
    }
}
