package com.myspringboot.controller;

import com.alibaba.fastjson.JSON;
import com.myspringboot.dao.ProjectReleaseMapper;
import com.myspringboot.dao.UserMapper;
import com.myspringboot.model.ProjectRelease;
import com.myspringboot.model.Users;
import com.myspringboot.service.impl.ProjectReleaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ProjectReleaseMapper projectReleaseMapper;

    @Autowired
    private ProjectReleaseServiceImpl projectReleaseServiceImpl;

    @GetMapping("/name")
    public String getUserName(String name, String pwd, String phone) {
        Random random = new Random();

        ProjectRelease projectRelease = projectReleaseMapper.selectByPrimaryKey("1");
        return JSON.toJSONString(projectRelease);

//        return name + "-" + random.nextInt(100) + "-@" + pwd + ":" + phone;
    }

    @GetMapping("/id")
    public Users getUser(@RequestParam("id") Integer id) {
        Users user = userMapper.selectByPrimaryKey(id);
        //user.setUserName("唐唐");
        System.out.println(user);
        return user;
    }
    @PostMapping("/insert")
    public void insterProjectRelease(@RequestBody ProjectRelease projectRelease){
        projectReleaseServiceImpl.saveProjectRelease();
    }

}
