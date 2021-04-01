package org.springaop.dao.impl;

import org.springaop.dao.UserDao;
import org.springaop.entity.User;

/**
 * @PackageName:org.springaop.dao.impl
 * @ClassName:UserDaoImpl
 * @Description:
 * @author: 悟空
 * @date: 2021/4/1 14:45
 * @email: 10947@163.com
 */
public class UserDaoImpl implements UserDao {
    @Override
    public String save(User user) {
        //这里并未实现完整的数据库操作，仅仅说明问题
        System.out.println("保存用户信息到数据库");
        return "有返回值！！！";
    }
}
