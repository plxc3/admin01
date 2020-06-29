package com.cdns.admin.controller;


import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.cdns.admin.common.Result;
import com.cdns.admin.entity.User;
import com.cdns.admin.service.UserService;
import com.cdns.admin.utils.MyPage;
import com.cdns.admin.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author plxc
 * @since 2020-06-25
 */
@Controller
@ResponseBody
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/get/{id}")
    public Result get(@PathVariable Integer id){

        User user=userService.getUserById(id);
        if(StringUtils.checkValNotNull(user)){
            return Result.getSuccess().setData(user);
        }else {
            return Result.getFail();
        }
    }

    @PostMapping("/save")
    public Result save(@RequestBody UserVo user){

        if(userService.saved(user)){
            return Result.getResult().setMsg("保存成功").setData(user);
        }
        else {
            return  Result.getFail().setMsg("保存失败");
        }
    }

    /**
     * 根据id删除user,逻辑删除
     * @param id
     * @return
     */
    @RequestMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id){

        if(userService.updateDeleted(id)){
            return  Result.getSuccess().setData("删除成功");
        }
        else {
            return Result.getFail().setData("删除失败");
        }
    }

    /**
     * user更新
     * @param user
     * @return
     */
    @PutMapping("/update")
    public Result update(@RequestBody User user){
        try {
               if( userService.updateUserById(user)){
                   return Result.getSuccess().setData("更新成功");
               }
               else {
                   return Result.getSuccess().setData("更新失败");
               }
        }catch (Exception e){
            e.printStackTrace();
            return Result.getFail().setData("异常");
        }
    }
    /**
     * 分页查询
     */
    @PostMapping("/page")
    public Result getPage(@RequestBody MyPage page){
        MyPage page1= userService.getByPage(page);
        return Result.getSuccess().setData(page1);
    }


}

