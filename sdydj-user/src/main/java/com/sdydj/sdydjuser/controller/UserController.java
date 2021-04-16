package com.sdydj.sdydjuser.controller;


import com.sdydj.bean.UmsMember;
import com.sdydj.bean.UmsMemberReceiveAddress;
import com.sdydj.service.UmsMemberReceiveAddressService;
import com.sdydj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    UmsMemberReceiveAddressService umsMemberReceiveAddressService;

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        return  userService.getAllUser();
    }

    @RequestMapping("getUmsMemberReceiveAddressByUmsMember")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByUmsMember(String id){
       return umsMemberReceiveAddressService.getUmsMemberReceiveAddressByUmsMember(id);
    }

}
