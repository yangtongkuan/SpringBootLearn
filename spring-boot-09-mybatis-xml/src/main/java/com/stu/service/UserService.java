package com.stu.service;

import com.stu.dao.UserMapper;
import com.stu.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @User: @Created by yangtk
 * @Date: @Date 2020/1/8 21:53
 * @To change this template use File | Settings | File Templates.
 */
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public List<UserInfo> queryAll() {
        return userMapper.queryAll();
    }
}
