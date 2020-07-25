package com.tugas5.wisnufebriramadhan.repository;

import com.tugas5.wisnufebriramadhan.model.UserModel;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<UserModel, String> {
    Optional<UserModel> findById(String id);

    UserModel findByUsername(String username);

    void deleteById(Query query, Class<UserModel> userModelClass);
}
