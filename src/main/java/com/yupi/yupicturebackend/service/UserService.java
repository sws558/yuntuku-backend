package com.yupi.yupicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yupi.yupicturebackend.model.dto.user.UserQueryRequest;
import com.yupi.yupicturebackend.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.yupicturebackend.model.vo.LoginUserVO;
import com.yupi.yupicturebackend.model.vo.UserVO;


import javax.servlet.http.HttpServletRequest;
import java.util.List;

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
    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 获取脱敏的登录用户信息
     * @param user
     * @return LoginUserVO
     */
    LoginUserVO getLoginUserVO(User user);
    /**
     * 获取脱敏的用户信息
     * @param user
     * @return LoginUserVO
     */
    UserVO getUserVO(User user);
    /**
     * 获取脱敏的用户列表
     *
     * @param user
     * @return LoginUserVO
     */
    List<UserVO> getUserVOList(List<User> user);
    /**
     * 获取当前用户
     * @param request
     * @return
     */
    User getLoginUser(HttpServletRequest request);
    /**
     * 用户注销
     */

    boolean userLogout(HttpServletRequest request);
    /**
     * 获取查询条件
     * @param userQueryRequest
     * @return
     */
    public QueryWrapper<User> getQueryWrapper(UserQueryRequest userQueryRequest);
}
