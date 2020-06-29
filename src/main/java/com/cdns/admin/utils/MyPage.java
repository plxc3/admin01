package com.cdns.admin.utils;

import com.cdns.admin.entity.User;
import lombok.Data;

import java.util.List;


/**
 * @PackgeName: com.cdns.admin.utils
 * @ClassName: Page
 * @Author: plxc
 * Date: 2020/6/26 22:24
 * project name: admin
 * @Version:
 * @Description:
 */
@Data
public class MyPage<T> {
    /**
     * 当前页
     */
    private Integer current;
    /**
     * 每页条数
     */
    private Integer size;
    /**
     * 总叶数
     */
    private Long total;
    /**
     * params
     */
    private User params;
    /**
     * 记录封装
     */
    private List<User> userList;
}
