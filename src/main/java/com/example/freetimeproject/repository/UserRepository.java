package com.example.freetimeproject.repository;

import com.example.freetimeproject.classes.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);

}
