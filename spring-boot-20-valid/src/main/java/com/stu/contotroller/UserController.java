package com.stu.contotroller;

import com.stu.UserService;
import com.stu.entity.UserEntity;
import com.stu.utils.EResultCode;
import com.stu.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("/user")
@RestController
@Slf4j
public class UserController {


    @Autowired
    private UserService userService;

    /**
     * 创建用户
     * F1. 用户账号密码等信息需要程序自己验证 程序可读性查 代码冗余严重
     *
     * @param userEntity
     * @return
     */
    @PostMapping("/save")
    public R<UserEntity> user_auth1(@RequestBody UserEntity userEntity) {
        if (StringUtils.isEmpty(userEntity.getUsername())) {
            return R.fail(EResultCode.SUCCESS, "用户账号不能为空");
        }
        if (StringUtils.isEmpty(userEntity.getPwd())) {
            return R.fail(EResultCode.SUCCESS, "用户密码不能为空");
        }
        userEntity = userService.save(userEntity);
        return R.success(userEntity);
    }

    /**
     * 创建用户
     * F2. 使用JSR303效验器
     * 1). 实体类上标注注解  例如@NotBlank(message="用户")
     * 2). 入参处使用@valid注解 标注需要验证
     * 3). 在入参处声明BindingResult 对象 获取验证中的错误信息
     *
     * @param userEntity
     * @return
     */
    @PostMapping("/save2")
    public R<Object> user_auth2(@RequestBody @Valid UserEntity userEntity, BindingResult result) {
        if (result.hasErrors()) {
            Map<String, String> errorMap = new HashMap<>();
            result.getFieldErrors().forEach((item) -> {
                //FieldError 获取到错误提示
                String message = item.getDefaultMessage();
                //获取错误的属性的名字
                String field = item.getField();
                errorMap.put(field, message);
                log.error(field + ":" + message);
            });
            return R.fail(EResultCode.ERROR).setData(errorMap);
        }
        if (StringUtils.isEmpty(userEntity.getUsername())) {
            return R.fail(EResultCode.SUCCESS, "用户账号不能为空");
        }
        if (StringUtils.isEmpty(userEntity.getPwd())) {
            return R.fail(EResultCode.SUCCESS, "用户密码不能为空");
        }
        userEntity = userService.save(userEntity);
        return R.success(userEntity);
    }

}
