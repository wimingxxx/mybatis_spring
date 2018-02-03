package com.qwm.mybatisspring.dao;

import com.qwm.mybatisspring.po.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by qiwenming on 2018/02/04.
 */
public class UserDaoImplTest {
    private ApplicationContext applicationContext;
    @Before
    public void setUp() throws Exception {
        //创建spring容器
        applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");

    }

    @Test
    public void testFindUserById() throws Exception {
        //从spring容器中获取UserDao这个bean
        IUserDao userDao = (IUserDao) applicationContext.getBean("userDao");
        User user = userDao.findUserById(10);
        System.out.println(user);
    }
}
