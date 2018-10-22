package com.example.demo.controller;

import com.example.demo.entity.LoginUser;
import com.example.demo.service.SysUserService;
import com.example.demo.utils.ResponseUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost")
public class SysUserController {
    @Resource
    private SysUserService sysUserService;

    @RequestMapping(value = "/sign_in", method = RequestMethod.POST)
    public ResponseUtil signIn(@RequestBody LoginUser loginUser) {
        System.out.println(loginUser);
        return sysUserService.userLogin(loginUser);
    }

    @RequestMapping(value = "/hot", method = RequestMethod.GET)
    public ResponseUtil getHotUsers() {
        return new ResponseUtil(0, "get hot users!", sysUserService.getHotUsers());
    }

}
