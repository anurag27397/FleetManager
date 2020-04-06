package org.anurag.service;

import org.anurag.entity.User;
import org.anurag.exception.UserNotFoundException;
import org.anurag.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImplementation implements UserService{

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> findAll() {
      return repository.findAll();

    }

    @Override
    public User findOne(String id) {
        User user = repository.findOne(id);
        if(user==null)
        {
          throw new UserNotFoundException("User with id"+id+ "Not Found");
        }
        else{
            return user;
        }

    }

    @Override
    public User create(User user) {
        return repository.create(user);

    }

    @Override
    public User update(String id, User user) {
        return repository.update(id, user);
    }

    @Override
    public void delete(String id) {

    }
}
