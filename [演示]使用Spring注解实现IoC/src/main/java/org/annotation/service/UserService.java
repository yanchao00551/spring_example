package org.annotation.service;

import org.annotation.entity.User;
import org.springframework.stereotype.Service;

/**
 * 用户业务接口，定义了所需的业务方法
 * @author 悟空
 * @description //TODO
 * @date 9:45 2021/4/6
 * @param null
 * @return null
 */
public interface UserService {
    /**
     * 新增用户
     * @author 悟空
     * @description //TODO
     * @date 9:45 2021/4/6
     * @param user

     */
    void addNewUser(User user);
}
