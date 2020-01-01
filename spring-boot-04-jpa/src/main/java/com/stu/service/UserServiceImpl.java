package com.stu.service;

import com.stu.dao.UserRepository;
import com.stu.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @User: @Created by yangtk
 * @Date: @Date 2019/12/31 18:18
 * @Classname: UserServiceImpl
 * @To change this template use File | Settings | File Templates.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserInfo add(UserInfo user) {
        return userRepository.save(user);
    }

    @Override
    public UserInfo update(UserInfo userInfo) throws Exception {
        UserInfo info = userRepository.getUserInfoById(userInfo.getId());
        if (info == null) {
            throw new Exception("用户不存在");
        }
        info.setAge(userInfo.getAge()).setName(userInfo.getName());
        return userRepository.save(info);
    }

    /**
     * 必须使用时事务 若不使用 会报找不到可以执行的事务
     *
     * @param id
     */
    @Override
    @Transactional
    public void del(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserInfo findById(Long id) {
        return userRepository.getUserInfoById(id);
//        return userRepository.findOne(id);
    }

    @Override
    public List<UserInfo> fingByName(String name) {
        return userRepository.findByName(name);
    }
}
