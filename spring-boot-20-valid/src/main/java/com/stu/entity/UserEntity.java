package com.stu.entity;

import com.stu.valid.AddGroup;
import com.stu.valid.ModifyGroup;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowire;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 用户实体
 */
@Data
@Entity
@Table(name = "user_entity")
public class UserEntity {

    @Id
    @GeneratedValue
    @NotNull(message = "用户id不能为空")
    private Long userId;        // 用户id

    @NotNull(groups = {AddGroup.class}, message = "用户账号不能为空")
    private String username;    // 用户账号

    private Integer age;        // 用户年龄

    @NotNull(groups = {AddGroup.class}, message = "用户密码不能为空")
    private String pwd;         // 用户密码

}
