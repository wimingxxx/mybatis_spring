package com.qwm.mybatisspring.dao;

import com.qwm.mybatisspring.po.User;

/**
 * @author：qiwenming
 * @date：2018/1/6 0006
 * @description：
 *  用户Dao接口
 */
public interface IUserDao {
    /**
     * 根据用户id查询用户
     * @param id
     * @return
     * @throws Exception
     */
    public User findUserById(int id) throws Exception;
}
