package springaop.entity;

import java.io.Serializable;

/**
 * 用户实体类
 * @PackageName:org.springaop.entity
 * @ClassName:User
 * @Description:
 * @author: 悟空
 * @date: 2021/4/1 14:40
 * @email: 10947@163.com
 */
public class User  implements Serializable {
    /**
     * 用户id
     * @Author 悟空
     * @Description //TODO
     * @Date 14:41 2021/4/1
     * @Param
     * @return
     **/
    private Integer id;

    /**
     * 用户名
     * @Author 悟空
     * @Description //TODO
     * @Date 14:42 2021/4/1
     * @Param
     * @return
     **/
    private String username;

    /**
     * 密码
     * @Author 悟空
     * @Description //TODO
     * @Date 14:42 2021/4/1
     * @Param
     * @return
     **/
    private String password;

    /**
     * 电子邮件
     * @Author 悟空
     * @Description //TODO
     * @Date 14:42 2021/4/1
     * @Param
     * @return
     **/
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
