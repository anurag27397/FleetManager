package org.anurag.repository;

import org.anurag.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class UserRepositoryImplementation implements UserRepository {

    @Override
    public List<User> findAll() {
        List<User> users= new ArrayList<>();
        users.add(new User( "Anurag", "Gupta", "abc@gmail.com", "Gainesville"));
        users.add(new User("Anu", "Gupta", "anu@gmail.com", "Delhi"));
        users.add(new User("Ayush", "Gupta", "ayush@gmail.com", "Noida"));
        return users;
    }

    @Override
    public User findOne(String id) {
        User user= new User( "Anurag", "Gupta", "abc@gmail.com", "Gainesville");
        return user;

    }

    @Override
    public User create(User user) {
        User user1= new User( "Anurag", "Gupta", "abc@gmail.com", "Gainesville");
        return user;
    }

    @Override
    public User update(String id, User user) {
        User user2= new User( "Anurag", "Gupta", "abc@gmail.com", "Gainesville");
        return user;
    }

    @Override
    public void delete(String id) {

    }
}
