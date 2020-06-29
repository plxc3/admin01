package com.cdns.admin.service;

import com.cdns.admin.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cdns.admin.utils.MyPage;
import com.cdns.admin.vo.UserVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author plxc
 * @since 2020-06-25
 */
public interface UserService extends IService<User> {

    boolean saved(UserVo user);


    boolean updateDeleted(Integer id);

    boolean updateUserById(User user);

    MyPage getByPage(MyPage page);

    User getUserById(Integer id);
}
