package com.cdns.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cdns.admin.entity.User;
import com.cdns.admin.mapper.UserMapper;
import com.cdns.admin.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cdns.admin.utils.MyPage;
import com.cdns.admin.vo.UserVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author plxc
 * @since 2020-06-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        return  userMapper.getUserById(id);
    }

    @Override
    public boolean saved(UserVo user) {
        User user1 = new User();
        user1.setDeleted(0);
        BeanUtils.copyProperties(user, user1);
        return save(user1);
    }

    @Override
    public boolean updateDeleted(Integer id) {
        if(userMapper.deleteById(id)>0){
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 加入乐观锁
     * 先查询再更新
     *
     * @param user
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean updateUserById(User user) {
        User user1 = getById(user.getUserId());
        user.setVersion(user1.getVersion());
        if (updateById(user)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 根据page查询
     *
     * @param page
     */
    @Override
    public MyPage getByPage(MyPage page) {

        MyPage myPage=new MyPage();
        IPage<User> iPage=new Page<>(page.getCurrent(),page.getSize());
        if(page.getParams().getUserName()!=null){
            QueryWrapper<User> queryWrapper=new QueryWrapper<User>();
            queryWrapper.like("user_name",page.getParams().getUserName());
            page(iPage,queryWrapper);
            myPage.setCurrent(page.getCurrent());
            myPage.setSize(page.getSize());
            myPage.setTotal(iPage.getTotal());
            myPage.setUserList(iPage.getRecords());
        }else{
            page(iPage,null);
            myPage.setCurrent(page.getCurrent());
            myPage.setSize(page.getSize());
            myPage.setTotal(iPage.getTotal());
            myPage.setUserList(iPage.getRecords());
        }

        return myPage;
    }
}
