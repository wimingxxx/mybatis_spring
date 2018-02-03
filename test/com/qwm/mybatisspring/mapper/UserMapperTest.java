package com.qwm.mybatisspring.mapper;

import com.qwm.mybatisspring.dao.IUserDao;
import com.qwm.mybatisspring.po.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by qiwenming on 2018/02/04.
 */
public class UserMapperTest {
    private ApplicationContext applicationContext;
    @Before
    public void setUp() throws Exception {
        //创建spring容器
        applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");

    }

    @Test
    public void testFindUserById() throws Exception {
        //从spring容器中获取UserDao这个bean
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        User user = userMapper.findUserById(10);
        System.out.println(user);
    }
}
