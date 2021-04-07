package org.springmybatis.dao;


import org.springframework.stereotype.Repository;
import org.springmybatis.pojo.User;

import java.util.List;

/**
 * 持久化方法
 * @author 悟空
 * @description //TODO
 * @date 10:39 2021/4/7
 * @param null
 * @return null
 */
@Repository
public interface UserMapper {
    /**
     * 查询用户列表（参数：对象入参)
     * @author 悟空
     * @description //TODO
     * @date 10:40 2021/4/7
     * @param user
     * @return java.util.List<org.springmybatis.pojo.User>
     */
    List<User> getUserList(User user);
}
