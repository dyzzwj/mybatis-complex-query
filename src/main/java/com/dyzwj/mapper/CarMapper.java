package com.dyzwj.mapper;

import com.dyzwj.bean.Car;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName CarMapper.java
 * @Description TODO
 * @createTime 2020年08月14日 14:45:00
 */
public interface CarMapper {

    @Select("select * from car where user_id = #{id}")
    List<Car> findCarByUserId(Long id);







}
