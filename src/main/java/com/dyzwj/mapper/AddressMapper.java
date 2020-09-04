package com.dyzwj.mapper;

import com.dyzwj.bean.Address;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName AddressMapper.java
 * @Description TODO
 * @createTime 2020年08月14日 14:45:00
 */
public interface AddressMapper {

    @Select("select * from address where id = #{id}")
    List<Address> findAddressById(Long id);
}
