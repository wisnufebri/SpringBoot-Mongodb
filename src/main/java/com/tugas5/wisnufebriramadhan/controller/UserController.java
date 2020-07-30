package com.tugas5.wisnufebriramadhan.controller;

import com.tugas5.wisnufebriramadhan.model.UserModel;
import com.tugas5.wisnufebriramadhan.repository.UserRepository;
import com.tugas5.wisnufebriramadhan.util.service.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

//    @Autowired
//    UserRepository userRepository;
//
//    @Autowired
//    UserDetailsImpl userDetailsImpl;
//
//    @GetMapping
//    public List<UserModel> getAllUser(@RequestParam(value = "page", defaultValue = "0") Integer pageNo,
//                                      @RequestParam(value = "sortKey", defaultValue = "username") String sortKey) {
//        return userDetailsImpl.getAllUser(pageNo, sortKey);
//    }
//
//    @GetMapping("/{id}")
//    public Optional<UserModel> getUserById(@PathVariable String id) {
//        return userDetailsImpl.getUserById(id);
//    }
//
//    @PostMapping("/detailInsert")
//    public UserModel insertUser(@RequestBody UserModel user) {
//        this.userDetailsImpl.insertUser(user);
//        return user;
//    }
//
//    @PostMapping("/insert")
//    public UserModel createUser(@RequestBody UserModel body) {
//        UserModel result = userRepository.save(body);
//        return result;
//    }
//
//    @DeleteMapping("")
//    public Map<String, Object> deleteById(@RequestParam String id) {
//       return userDetailsImpl.deleteById(id);
//    }
//
//    @PutMapping("/update")
//    public Map<String, Object> updateUser(@RequestBody UserModel user){
//        return this.userDetailsImpl.updateUser(user);
//    }
}
