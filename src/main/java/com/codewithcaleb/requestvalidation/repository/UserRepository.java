package com.codewithcaleb.requestvalidation.repository;

import com.codewithcaleb.requestvalidation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Integer> {
    User findByUserId(int user_id);
}
