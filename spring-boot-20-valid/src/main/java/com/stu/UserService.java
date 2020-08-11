package com.stu;

import com.stu.entity.UserEntity;
import org.springframework.stereotype.Service;

/**
 * 用户服务
 */
@Service
public class UserService {

    public UserEntity save(UserEntity userEntity) {
        return userEntity;
    }
}
