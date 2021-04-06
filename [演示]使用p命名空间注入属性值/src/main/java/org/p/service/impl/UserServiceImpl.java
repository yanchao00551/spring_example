package org.p.service.impl;


import org.p.dao.UserDao;
import org.p.entity.User;
import org.p.service.UserService;

/**
 * @PackageName:org.constructor.service.impl
 * @ClassName:UserServiceImpl
 * @Description:
 * @author: 悟空
 * @date: 2021/4/6 9:46
 * @email: 10947@163.com
 */
public class UserServiceImpl implements UserService {

    /**
     * 声明接口类型的引用，和具体实现类解耦
     * @author 悟空
     * @description //TODO
     * @date 9:51 2021/4/6
     * @param null
     * @return null
     */
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

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
        userDao.save(user);
    }
}
