package com.example.jpa.bookmanager.repository;

import com.example.jpa.bookmanager.domain.User;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.endsWith;


@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    @Transactional
    void crud() {
//           long count = userRepository.count();
//            System.out.println(count);

//        boolean exists = userRepository.existsById(1L);
//        System.out.println(exists);
//        long count = userRepository.count();
//        System.out.println(count);
//
//        boolean exists = userRepository.existsById(1L);
//        System.out.println(exists);
//
        /*userRepository.delete(userRepository.findById(1L).orElseThrow(RuntimeException::new));*/
//
//        userRepository.deleteAll();
//        userRepository.findAll().forEach(System.out::println);
//
//        userRepository.deleteAllInBatch();
//
//        userRepository.deleteInBatch();
//
//        userRepository.delete(userRepository.findById(1L).orElseThrow(RuntimeException::new));
//        userRepository.deleteById(1L);
//
//        userRepository.deleteAll(userRepository.findAllById(Lists.newArrayList(1L,3L)));
//        userRepository.findAll().forEach(System.out::println);
//
//        userRepository.deleteAllInBatch();
//
//        userRepository.deleteInBatch();
//
//        Page<User> users = userRepository.findAll(PageRequest.of(1,3));

//        System.out.println(users);
//        ExampleMatcher matcher = ExampleMatcher.matching()
//                .withIgnorePaths("name")
//                .withMatcher("email",endsWith());
//
//        Example<User> example = Example.of(new User("a","a.com"),matcher);
//
//        userRepository.findAll(example).forEach(System.out::println);
        
//        userRepository.save(new User("david","123@123.com"));
//        User user = userRepository.findById(1L).orElseThrow(RuntimeException::new);
//        user.setEmail("231@naver.com");
//        userRepository.saveAndFlush(user);

        User user = new User();
        user.setEmail("yusun715@naver.com");
        user.setName("martin");

        userRepository.save(user);
        System.out.println(userRepository.findByEmail("yusun715@naver.com"));

    }

    @Test
    void select() {
//        System.out.println(userRepository.findByName("a"));
//        System.out.println(userRepository.findByEmailAndName("a@a.com","123"));
//        System.out.println(userRepository.findByNameIn(Lists.newArrayList("martin","dennis")));
//        System.out.println(userRepository.findByNameStartingWith("mar"));
//        System.out.println(userRepository.findByNameEndingWith("in"));
//        System.out.println(userRepository.findByNameContaining("mar"));
        System.out.println(userRepository.findByNameLike("%in"));

    }

    @Test
    void preUpdatest(){
        User user = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        System.out.println("as-is : "+user);
        user.setName("martin22");
        userRepository.save(user);

        System.out.println("to-be : "+ userRepository.findAll().get(0));
    }
}