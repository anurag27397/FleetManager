package org.anurag.controller;
import org.anurag.entity.User;
import org.anurag.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping(value = "users")
public class UserController {

   @Autowired
    private UserService service;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> findAll()
    {
     return service.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    @ResponseBody
    public User findOne(@PathVariable("id") String userId)
    {
        return service.findOne(userId);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public User create(@RequestBody User user)
    {
        return service.create(user);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "{id}")
    @ResponseBody
    public User update(@PathVariable("id") String id, @RequestBody User user)
    {
        return service.update(id, user);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "{id}")
    @ResponseBody
    public void delete(@PathVariable("id") String id)
    {

    }




}
