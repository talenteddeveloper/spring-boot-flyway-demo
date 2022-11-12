package com.talenteddeveloper.flywaydemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.talenteddeveloper.flywaydemo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
