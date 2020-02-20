package com.stu.controller;

import com.stu.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @User: @Created by yangtk
 * @Date: @Date 2020/2/18 11:53
 * @To change this template use File | Settings | File Templates.
 */
@RestController
public class StaffController {

    @Autowired
    private StaffService staffService;

    // 查询
    @GetMapping("/staff/{id}")
    public Object getStaff(@PathVariable("id") Long id) {
        return staffService.getStaff(id);
    }


}
