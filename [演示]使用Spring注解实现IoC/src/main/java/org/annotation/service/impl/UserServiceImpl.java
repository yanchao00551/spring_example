package org.annotation.service.impl;


import org.annotation.dao.UserDao;
import org.annotation.entity.User;
import org.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @PackageName:org.constructor.service.impl
 * @ClassName:UserServiceImpl
 * @Description:
 * @author: 悟空
 * @date: 2021/4/6 9:46
 * @email: 10947@163.com
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    /**
     * 声明接口类型的引用，和具体实现类解耦
     * @author 悟空
     * @description //TODO
     * @date 9:51 2021/4/6
     * @param null
     * @return null
     */
    @Autowired
    private UserDao userDao;


    /**
     * 无参构造
     * @author 悟空
     * @description //TODO
     * @date 9:54 2021/4/6
     * @param
     * @return null
     */
    public UserServiceImpl() {
    }

    /**
     * 用于为dao属性赋值的构造方法
     * @author 悟空
     * @description //TODO
     * @date 9:52 2021/4/6
     * @param userDao
     * @return null
     */
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addNewUser(User user) {
        //调用用于DAO的方法保存用户信息
        userDao.save(user);
    }
}
