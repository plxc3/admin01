package com.cdns.admin.vo;

import lombok.Data;

import java.util.Date;

/**
 * @PackgeName: com.cdns.admin.vo
 * @ClassName: UserVo
 * @Author: plxc
 * Date: 2020/6/26 0:38
 * project name: admin
 * @Version:
 * @Description:
 */
@Data
public class UserVo {

    private String userName;
    private Integer userSex;
    private Integer userAge;
    private String userBirthd;
    private Integer userDepartment;

}
