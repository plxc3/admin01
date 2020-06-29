package com.cdns.admin.mapper;

import com.cdns.admin.entity.Department;
import com.cdns.admin.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.Map;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author plxc
 * @since 2020-06-25
 */
@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

    @Select("SELECT * from user WHERE user_id=#{id} AND deleted=0")
//    @Results(@Result(column="id",property="department",one=@One(select = "com.cdns.admin.mapper.DepartmentMapper.findById")))
    User getUserById(Integer id);

}
