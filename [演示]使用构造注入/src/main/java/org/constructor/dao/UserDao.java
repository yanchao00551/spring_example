package org.constructor.dao;

import org.constructor.entity.User;

/**
 * 增加DAO接口，定义了所需的持久化方法
 * @author 悟空
 * @description //TODO
 * @date 9:47 2021/4/6
 * @param null
 * @return null
 */
public interface UserDao {
    /**
     * 保存用户
     * @author 悟空
     * @description //TODO
     * @date 9:48 2021/4/6
     * @param user
     */
    void save(User user);
}
