package springaop.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springaop.dao.UserDao;
import springaop.entity.User;
import springaop.service.UserService;

/**
 * 用户业务类，实现了对User功能的业务管理
 * @PackageName:org.springaop.service.impl
 * @ClassName:UserServiceImpl
 * @Description:
 * @author: 悟空
 * @date: 2021/4/1 14:49
 * @email: 10947@163.com
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    //声明接口类型的引用，和具体实现类解耦
    @Autowired
    private UserDao dao;


    @Override
    public String addNewUser(User user) {
        //调用用户DAO的方法保存用户信息
        return dao.save(user);
    }

}
