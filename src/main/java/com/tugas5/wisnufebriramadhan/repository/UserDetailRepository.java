package com.tugas5.wisnufebriramadhan.repository;

import com.tugas5.wisnufebriramadhan.model.UserDetailModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailRepository extends MongoRepository<UserDetailModel, String> {
}
