package com.example.demo.dao;

import com.example.demo.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by 高展 on 2018/10/22.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserRepositryTest {
    @Resource
    private SysUserRepositry sysUserRepositry;

    @Test
    public void findSysUserByEmail() {
        SysUser sysUser = sysUserRepositry.findSysUserByEmail("aaa@qq.com");
        if (sysUser != null) {
            System.out.println(sysUser);
        }
    }
}