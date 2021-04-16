package com.sdydj.sdydjuser.serviceImpl;



import com.sdydj.bean.UmsMember;
import com.sdydj.sdydjuser.mapper.UserMapper;
import com.sdydj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
