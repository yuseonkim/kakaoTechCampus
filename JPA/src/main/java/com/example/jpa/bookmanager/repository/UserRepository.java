package com.example.jpa.bookmanager.repository;

import com.example.jpa.bookmanager.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
//    Optional<User> findByName(String name);
//
//    User findByEmail(String email);
//
//    User getByEmail(String email);
//
//    List<User> findByEmailAndName(String email, String name);
//
//    List<User> findByEmailOrName(String email,String name);
//
//    List<User> findByIdGreaterThan(long id);
//
//    List<User> findByIdBetween(long a,long b);
//
//    List<User> findByIdIsNotNull();
//
    /*List<User> findByAddressIsNotEmpty();*/
//
    List<User> findByNameIn(List<String> names);

    List<User> findByNameStartingWith(String name);
    List<User> findByNameEndingWith(String name);
    List<User> findByNameContaining(String name);
    List<User> findByNameLike(String name);


    User findByEmail(String mail);
}
