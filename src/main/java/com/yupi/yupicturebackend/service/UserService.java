package com.yupi.yupicturebackend.service;

import com.yupi.yupicturebackend.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author sws
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2025-01-23 13:18:31
*/
public interface UserService extends IService<User> {
    /**
     * 用户注册
     *
     * @param userAccount
     * @param userPassword
     * @param checkPassword
     * @return 新用户id
     */
    long userRegister(String userAccount,String userPassword,String checkPassword);

    String getEncryptPassword(String userPassword);
}
