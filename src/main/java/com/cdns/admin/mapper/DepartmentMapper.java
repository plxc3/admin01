package com.cdns.admin.mapper;

import com.cdns.admin.entity.Department;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

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
public interface DepartmentMapper extends BaseMapper<Department> {
    @Select("select * from department where id=#{id}")
    Department findById(Integer id);
}
