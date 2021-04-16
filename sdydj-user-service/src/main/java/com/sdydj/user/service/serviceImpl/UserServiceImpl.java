package com.sdydj.user.service.serviceImpl;



import com.alibaba.dubbo.config.annotation.Service;
import com.sdydj.bean.UmsMember;

import com.sdydj.service.UserService;
import com.sdydj.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public List<UmsMember> getAllUser() {

        return userMapper.selectAllUser();
    }
}
