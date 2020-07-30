package com.tugas5.wisnufebriramadhan.repository;

import com.tugas5.wisnufebriramadhan.model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<UserModel, String> {

    Optional<UserModel> findById(String id);

    Optional<UserModel> findByUsername(String username);

    Boolean existByusername(String username);

    Boolean existByEmail(String email);

    @Query("{'userDetailModel.alamat': { $regex: ?0 } }")
    List<UserModel> findByAlamat(String alamat);

    void deleteById(String id);
}
