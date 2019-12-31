package com.stu.dao;

import com.stu.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created with IntelliJ IDEA.
 *
 * @User: @Created by yangtk
 * @Date: @Date 2019/12/31 18:19
 * @Classname: UserRepository
 * @To change this template use File | Settings | File Templates.
 */
public interface UserRepository extends JpaRepository<UserInfo, Long> {
}
