package com.qwm.mybatisspring.mapper;

import com.qwm.mybatisspring.po.Items;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by qiwenming on 2018/02/04.
 */
public class ItemsMapperTest {
    private ClassPathXmlApplicationContext applicationContext;
    private ItemsMapper itemsMapper;

    @Before
    public void setUp() throws Exception {
        // 创建spring容器

        applicationContext = new ClassPathXmlApplicationContext(
                "spring/applicationContext.xml");
        itemsMapper = (ItemsMapper) applicationContext.getBean("itemsMapper");

    }

    @Test
    public void countByExample() throws Exception {
    }

    @Test
    public void deleteByExample() throws Exception {
    }

    /**
     * 根据主键删除
     * @throws Exception
     */
    @Test
    public void deleteByPrimaryKey() throws Exception {
        itemsMapper.deleteByPrimaryKey(5);
    }

    /**
     * 插入
     * @throws Exception
     */
    @Test
    public void insert() throws Exception {
        Items items = new Items();
        items.setName("手机");
        items.setPrice(3000.0f);
        items.setCreatetime(new Date());
        itemsMapper.insert(items);
    }

    @Test
    public void insertSelective() throws Exception {
    }

    @Test
    public void selectByExampleWithBLOBs() throws Exception {
    }

    @Test
    public void selectByExample() throws Exception {
    }

    @Test
    public void selectByPrimaryKey() throws Exception {
    }

    @Test
    public void updateByExampleSelective() throws Exception {
    }

    @Test
    public void updateByExampleWithBLOBs() throws Exception {
    }

    @Test
    public void updateByExample() throws Exception {
    }

    @Test
    public void updateByPrimaryKeySelective() throws Exception {
    }

    @Test
    public void updateByPrimaryKeyWithBLOBs() throws Exception {
    }

    @Test
    public void updateByPrimaryKey() throws Exception {
    }

}