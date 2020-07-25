package com.tugas5.wisnufebriramadhan.controller;

import com.tugas5.wisnufebriramadhan.model.UserModel;
import com.tugas5.wisnufebriramadhan.repository.UserRepository;
import com.tugas5.wisnufebriramadhan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public String deleteById(@RequestParam String id) {
        userService.deleteById(id);
        return id;
    }

    @PutMapping("/update")
    public Map<String, Object> update(@RequestBody UserModel body) {
        System.out.println("body : " + body.toString());
        Map<String, Object> result = new HashMap<>();
        if (userService.updateUser(body)) {
            result.put("Status", true);
            result.put("Massage", "Berhasil Update data");
        } else {
            result.put("Status", false);
            result.put("Massage", "Gagal Update");
        }
        return result;
    }
}
