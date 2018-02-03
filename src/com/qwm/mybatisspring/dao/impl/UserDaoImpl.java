package com.qwm.mybatisspring.dao.impl;

import com.qwm.mybatisspring.dao.IUserDao;
import com.qwm.mybatisspring.po.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * @author：qiwenming
 * @date：2018/1/6 0006
 * @description：
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements IUserDao {

    /**
     * 根据用户id查询用户
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public User findUserById(int id) throws Exception {
        //创建Session
        SqlSession sqlSession = getSqlSession();
        //查询
        User user = sqlSession.selectOne("wiming.findUserById",id);
        return user;
    }
}
