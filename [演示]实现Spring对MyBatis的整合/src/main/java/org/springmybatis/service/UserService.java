package org.springmybatis.service;

import org.springmybatis.pojo.User;

import java.util.List;

/**
 * 用户业务逻辑
 * @author 悟空
 * @description //TODO
 * @date 10:38 2021/4/7
 * @param null
 * @return null
 */
public interface UserService {
    /**
     * 按条件查询用户
     * @author 悟空
     * @description //TODO
     * @date 10:53 2021/4/7
     * @param user
     * @return java.util.List<org.springmybatis.pojo.User>
     */
    List<User> findUsersByCondition(User user);
}

