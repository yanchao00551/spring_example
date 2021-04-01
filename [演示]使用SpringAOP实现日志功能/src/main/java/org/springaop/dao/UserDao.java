package org.springaop.dao;

import org.springaop.entity.User;

/**
 * 增加DAO接口，定义了所需的持久化方法
 * @Author 悟空
 * @Description //TODO 
 * @Date 14:45 2021/4/1
 * @Param 
 * @return 
 **/
public interface UserDao {
    String save(User user);
}
