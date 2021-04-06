package org.property.entity;

import java.io.Serializable;

/**
 * 用户实体类PO
 * @PackageName:org.property.entity
 * @ClassName:User
 * @Description:
 * @author: 悟空
 * @date: 2021/4/6 10:56
 * @email: 10947@163.com
 */
public class User implements Serializable {
    private String username;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
