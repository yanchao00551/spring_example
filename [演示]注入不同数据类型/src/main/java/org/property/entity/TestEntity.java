package org.property.entity;

import java.util.*;

/**
 * 测试实体
 * @PackageName:org.property.entity
 * @ClassName:TestEntity
 * @Description:
 * @author: 悟空
 * @date: 2021/4/6 10:58
 * @email: 10947@163.com
 */
public class TestEntity {
    /**
     * 特殊字符值1
     * @author 悟空
     * @description //TODO
     * @date 10:59 2021/4/6
     * @param null
     * @return null
     */
    private String specialCharacter1;
    /**
     * 特殊字符值2
     * @author 悟空
     * @description //TODO
     * @date 11:00 2021/4/6
     * @param null
     * @return null
     */
    private String specialCharacter2;

    /**
     * JavaBean类型
     * @author 悟空
     * @description //TODO
     * @date 11:01 2021/4/6
     * @param null
     * @return null
     */
    private User innerBean;

    /**
     * List类型
     * @author 悟空
     * @description //TODO
     * @date 11:01 2021/4/6
     * @param null
     * @return null
     */
    private List<String> list;

    /**
     * 数组类型
     * @author 悟空
     * @description //TODO
     * @date 11:02 2021/4/6
     * @param null
     * @return null
     */
    private String[] array;

    /**
     * Set类型
     * @author 悟空
     * @description //TODO
     * @date 11:03 2021/4/6
     * @param null
     * @return null
     */
    private Set<String> set;

    /**
     * Map类型
     * @author 悟空
     * @description //TODO
     * @date 11:03 2021/4/6
     * @param null
     * @return null
     */
    private Map<String,String > map;

    /**
     * Properties类型
     * @author 悟空
     * @description //TODO
     * @date 11:04 2021/4/6
     * @param null
     * @return null
     */
    private Properties properties;

    /**
     * 注入空字符串
     * @author 悟空
     * @description //TODO
     * @date 11:07 2021/4/6
     * @param null
     * @return null
     */
    private String emptyValue;

    /**
     * 注入null值
     * @author 悟空
     * @description //TODO
     * @date 11:07 2021/4/6
     * @param null
     * @return null
     */
    private String nullValue = "init value";

    /**
     * 用户列表
     * @author 悟空
     * @description //TODO
     * @date 11:32 2021/4/6
     * @param null
     * @return null
     */
    private List<User> listUser;

    public void setListUser(List<User> listUser) {
        this.listUser = listUser;
    }

    public void setSpecialCharacter1(String specialCharacter1) {
        this.specialCharacter1 = specialCharacter1;
    }

    public void setSpecialCharacter2(String specialCharacter2) {
        this.specialCharacter2 = specialCharacter2;
    }

    public void setInnerBean(User innerBean) {
        this.innerBean = innerBean;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setEmptyValue(String emptyValue) {
        this.emptyValue = emptyValue;
    }

    public void setNullValue(String nullValue) {
        this.nullValue = nullValue;
    }

    @Override
    public String toString() {
        return "TestEntity{" +
                "specialCharacter1='" + specialCharacter1 + '\'' +
                ", specialCharacter2='" + specialCharacter2 + '\'' +
                ", innerBean=" + innerBean +
                ", list=" + list +
                ", array=" + Arrays.toString(array) +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                ", emptyValue='" + emptyValue + '\'' +
                ", nullValue='" + nullValue + '\'' +
                '}';
    }
}

