package org.springmybatis.pojo;

import lombok.ToString;

import java.util.List;

/**
 * 前端入参json字符串映射到这个javabean中去
 * @author 悟空
 * @description //TODO
 * @date 9:34 2021/4/9
 * @param null
 * @return null
 */
@ToString
public class SysUser {

    /**
     * id : 28
     * data : hello
     * userList : [{"uid":"1","age":"22"},{"uid":"2","age":"28"}]
     * limit : 5
     */

    private Integer id;
    private String data;
    private String limit;
    private List<UserListBean> userList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public List<UserListBean> getUserList() {
        return userList;
    }

    public void setUserList(List<UserListBean> userList) {
        this.userList = userList;
    }

    @ToString
    public static class UserListBean {
        /**
         * uid : 1
         * age : 22
         */

        private Integer uid;
        private String age;

        public Integer getUid() {
            return uid;
        }

        public void setUid(Integer uid) {
            this.uid = uid;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }
    }
}
