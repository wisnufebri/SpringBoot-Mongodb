package com.tugas5.wisnufebriramadhan.service;

import com.tugas5.wisnufebriramadhan.model.UserModel;
import com.tugas5.wisnufebriramadhan.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository usersRepository;

    public List<UserModel> getAllUser(Integer pageNo, String sortKey) {
        int noOfRecord = 5;
        Pageable page = PageRequest.of(pageNo, noOfRecord, Sort.by(sortKey));
        Page<UserModel> pagedResult = usersRepository.findAll(page);
        return pagedResult.getContent();
    }

    public void deleteById(String id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));
        usersRepository.deleteById(id);
    }

    public boolean updateUser(UserModel body) {
        Optional<UserModel> result = usersRepository.findById(body.getId());
        if (result != null) {
            try {
                usersRepository.save(body);
                return true;
            } catch (Exception e) {
                return false;
            }
        } else {
            return false;
        }
    }


}
