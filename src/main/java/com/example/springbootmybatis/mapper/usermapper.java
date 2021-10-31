package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.pojo.user;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper//代表一个mybatis的mapper类
@Repository
public interface usermapper {
    //@Select("SELECT * FROM user11")
    List<user> queryuserlist();
    user queryuserbyid(int id);
    int adduser(user user);
    int updateuser(user user);
    int deleteuser(int id);
}
