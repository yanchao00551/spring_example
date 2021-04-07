package org.springmybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springmybatis.dao.UserMapper;
import org.springmybatis.pojo.User;
import org.springmybatis.service.UserService;

import java.util.List;

/**
 * @PackageName:org.springmybatis.service.impl
 * @ClassName:UserServiceImpl
 * @Description:
 * @author: 悟空
 * @date: 2021/4/7 10:33
 * @email: 10947@163.com
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findUsersByCondition(User user) {
        try{
            return userMapper.getUserList(user);
        }catch (RuntimeException e){
            e.printStackTrace();
            throw e;
        }
    }
}
