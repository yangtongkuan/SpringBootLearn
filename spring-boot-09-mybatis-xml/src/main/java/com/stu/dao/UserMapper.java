package com.stu.dao;

import com.stu.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @User: @Created by yangtk
 * @Date: @Date 2020/1/8 21:53
 * @To change this template use File | Settings | File Templates.
 */
@Mapper
public interface UserMapper {

    List<UserInfo> queryAll();
}
