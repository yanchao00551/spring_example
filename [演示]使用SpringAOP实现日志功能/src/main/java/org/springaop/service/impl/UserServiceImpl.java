package org.springaop.service.impl;

import org.springaop.dao.UserDao;
import org.springaop.entity.User;
import org.springaop.service.UserService;

/**
 * 用户业务类，实现了对User功能的业务管理
 * @PackageName:org.springaop.service.impl
 * @ClassName:UserServiceImpl
 * @Description:
 * @author: 悟空
 * @date: 2021/4/1 14:49
 * @email: 10947@163.com
 */
public class UserServiceImpl implements UserService {

    //声明接口类型的引用，和具体实现类解耦
    private UserDao dao;

    //dao 属性的setter访问器，会被spring调用，实现设值注入
    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public String addNewUser(User user) {
        //调用用户DAO的方法保存用户信息
        return dao.save(user);
    }
}
