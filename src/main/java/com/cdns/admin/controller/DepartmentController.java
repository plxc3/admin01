package com.cdns.admin.controller;


import com.cdns.admin.common.Result;
import com.cdns.admin.entity.Department;
import com.cdns.admin.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author plxc
 * @since 2020-06-25
 */
@Controller
@RequestMapping("/department")
@ResponseBody
public class DepartmentController {

    @Autowired
    private DepartmentService department;

    /**
     * 查询部门列表
     * @return
     */
    @GetMapping("/list")
    public Result getDempartmentList(){
        List<Department>departmentList=department.getList();
        if(departmentList!=null){
            return Result.getSuccess().setData(departmentList);
        }
        else {
            return Result.getFail();
        }
    }

}

