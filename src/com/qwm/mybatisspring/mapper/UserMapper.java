package com.qwm.mybatisspring.mapper;

import com.qwm.mybatisspring.po.User;

import java.util.List;

/**
 * @author：qiwenming
 * @date：2018/1/6 0006
 * @description：
 */
public interface UserMapper {
    /**
     * 根据用户id查询用户
     * @param id
     * @return
     * @throws Exception
     */
    public User findUserById(int id) throws Exception;
}
