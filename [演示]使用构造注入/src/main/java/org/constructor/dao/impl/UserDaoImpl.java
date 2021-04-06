package org.constructor.dao.impl;

import org.constructor.dao.UserDao;
import org.constructor.entity.User;

/**
 * @PackageName:org.constructor.dao.impl
 * @ClassName:UserDaoImpl
 * @Description:
 * @author: 悟空
 * @date: 2021/4/6 9:49
 * @email: 10947@163.com
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void save(User user) {
        //这里并未实现完整的数据库操作，只为说明问题
        System.out.println("保存用户信息到数据库");
    }
}
