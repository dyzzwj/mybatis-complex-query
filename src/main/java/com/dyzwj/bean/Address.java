package com.dyzwj.bean;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName Address.java
 * @Description TODO
 * @createTime 2020年08月14日 14:42:00
 */
public class Address {

    private Long id;
    private String province;
    private String city;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
