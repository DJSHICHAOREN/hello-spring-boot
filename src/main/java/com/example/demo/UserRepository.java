package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// User: 类名
// Integer: id类型
public interface UserRepository extends JpaRepository<User, Integer> {

//    public List<User> getUserByAge(Integer age);

    public List<User> findAllByAge(Integer age);
}
