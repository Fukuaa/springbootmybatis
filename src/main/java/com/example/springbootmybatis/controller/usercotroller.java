package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.mapper.usermapper;
import com.example.springbootmybatis.pojo.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class usercotroller {
    @Autowired
    private usermapper usermapper;
    @RequestMapping("/userlist")
    public List<user> queryuserlist(){
        List<user> userList = usermapper.queryuserlist();
        for (user user : userList){
            System.out.println(user);
        }
        return userList;
    }
    @RequestMapping("/userlist1")
    public String queryuserlist1(){
        return "userLis";
    }
}
