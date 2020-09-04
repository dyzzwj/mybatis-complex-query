package com.dyzwj.bean;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName Car.java
 * @Description TODO
 * @createTime 2020年08月14日 14:42:00
 */
public class Car {
    private Long id;
    private String color;
    private String name;
    //用户id
    private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
