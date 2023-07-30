package com.example.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;


class UserTest {

    @Test
    void test(){
        User user = new User();
        user.setEmail("martin@a.com");
        user.setName("martin");
        user.setCreatedAt(LocalDateTime.now());;
        user.setUpdatedAt(LocalDateTime.now());

        System.out.println(user.toString());
    }



}