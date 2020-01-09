package com.stu.service;

import com.stu.dao.PersonMapper;
import com.stu.entity.Person;
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
public class PersonService {

    @Autowired
    private PersonMapper personMapper;

    public List<Person> queryAll() {
        return personMapper.queryAll();
    }

    public List<Person> searchByName(String name) {
        return personMapper.searchByNameLike(name);
    }

}
