package org.anurag.repository;

import org.anurag.entity.User;

import java.util.List;

public interface UserRepository {

    List<User> findAll();
    User findOne( String id);
    User create(User user);
    User update(String id, User user);
    void delete(String id);


}
