package org.springmybatis.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @PackageName:org.springmybatis.pojo
 * @ClassName:User
 * @Description:
 * @author: 悟空
 * @date: 2021/4/7 10:36
 * @email: 10947@163.com
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class User implements Serializable {
    private Integer id;
    private String loginName;
    private String userName;
    private String password;
    private Integer sex;
    private String identityCode;
    private String email;
    private String mobile;
    private Integer type;
}
