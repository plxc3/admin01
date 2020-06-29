package com.cdns.admin.service;

import com.cdns.admin.entity.Department;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author plxc
 * @since 2020-06-25
 */
public interface DepartmentService extends IService<Department> {
    List<Department> getList();
}
