package com.tugas5.wisnufebriramadhan.repository;

import com.tugas5.wisnufebriramadhan.model.ERole;
import com.tugas5.wisnufebriramadhan.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
