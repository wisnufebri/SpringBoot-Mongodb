package com.tugas5.wisnufebriramadhan.repository;

import com.tugas5.wisnufebriramadhan.model.KurirModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface KurirRepository extends MongoRepository<KurirModel, String> {
    
    Optional<KurirModel> findById(String s);
}
