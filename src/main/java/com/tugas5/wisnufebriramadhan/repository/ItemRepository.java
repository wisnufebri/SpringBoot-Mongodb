package com.tugas5.wisnufebriramadhan.repository;

import java.util.Optional;

import com.tugas5.wisnufebriramadhan.model.ItemModel;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends MongoRepository<ItemModel, String> {
    Optional<ItemModel> findById(String id);
}