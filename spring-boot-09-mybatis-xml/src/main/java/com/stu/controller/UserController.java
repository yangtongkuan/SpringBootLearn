package com.stu.controller;

import com.stu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @User: @Created by yangtk
 * @Date: @Date 2020/1/8 22:36
 * @To change this template use File | Settings | File Templates.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/list")
    public Object get() {
        return userService.queryAll();
    }
}
