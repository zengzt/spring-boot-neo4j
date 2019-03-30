package com.example.demo1.repository;

import com.example.demo1.model.User;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Component;


//当springboot的版本为2.1.3的时候GraphRepository这个类没有，不能继承
//当springboot的版本为1.5.6的时候GraphRepository这个类正常使用


@Component
public interface UserRepository extends GraphRepository<User> {

    @Query("match (n:user) return n")
    Iterable<User> getUserId();

    @Query("match (n:user) return count(*)")
    Integer getUserCount();
}
