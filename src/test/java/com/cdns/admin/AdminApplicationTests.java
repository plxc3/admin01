package com.cdns.admin;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cdns.admin.entity.User;
import com.cdns.admin.mapper.DepartmentMapper;
import com.cdns.admin.mapper.UserMapper;
import net.minidev.json.JSONUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLOutput;
import java.util.List;

@SpringBootTest
class AdminApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        IPage<User> page=new Page<>(3,2);
        page=userMapper.selectPage(page,null);
        List<User> userList=page.getRecords();
        for(User user:userList){
            System.out.println(user);
        }
    }


}
