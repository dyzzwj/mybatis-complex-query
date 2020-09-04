package com.dyzwj.mapper;

import com.dyzwj.bean.User;
import org.apache.ibatis.annotations.*;

public interface UserMapper {


    @Results(
            @Result(property = "address",column = "address_id",
                one = @One(select = "com.dyzwj.mapper.AddressMapper.findAddressById")
            )
    )
    @Select("select * from user where id = #{id}")
    User findUserWithAddress(Long id);




}
