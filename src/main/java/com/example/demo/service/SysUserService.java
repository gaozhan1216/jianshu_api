package com.example.demo.service;

import com.example.demo.entity.LoginUser;
import com.example.demo.entity.SysUser;
import com.example.demo.utils.ResponseUtil;

import java.util.List;

public interface SysUserService {
    ResponseUtil userLogin(LoginUser loginUser);

    List<SysUser> getHotUsers();
}
