package springaop.service;


import springaop.entity.User;

/**
 * 用户业务接口，定义了所需的业务方法
 * @Author 悟空
 * @Description //TODO
 * @Date 14:48 2021/4/1
 * @Param
 * @return
 **/
public interface UserService {
    /**
     * 增加用户
     * @Author 悟空
     * @Description //TODO
     * @Date 14:49 2021/4/1
     * @Param [user]
     * @return void
     **/
    String addNewUser(User user);
}
