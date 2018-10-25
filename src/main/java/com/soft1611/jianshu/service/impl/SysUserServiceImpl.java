package com.soft1611.jianshu.service.impl;

import com.soft1611.jianshu.dao.SysUserMapper;
import com.soft1611.jianshu.model.SysUser;
import com.soft1611.jianshu.service.SysUserService;
import com.soft1611.jianshu.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by taoranran on 2018/10/25.
 */
@Service
@Transactional
public class SysUserServiceImpl extends AbstractService<SysUser> implements SysUserService {
    @Resource
    private SysUserMapper sysUserMapper;

}
