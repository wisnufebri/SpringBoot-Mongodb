package com.tugas5.wisnufebriramadhan.repository;

import java.util.List;
import java.util.Optional;

import com.tugas5.wisnufebriramadhan.model.LayananKurirModel;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LayananKurirRepository extends MongoRepository<LayananKurirModel, String> {

    Optional<LayananKurirModel> findById(String id);

    @Query("{'kurirmodel.id': ?0}")
    List<LayananKurirModel> findByIdkurir(String id);
}
