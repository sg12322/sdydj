package com.sdydj.user.service.serviceImpl;





import com.alibaba.dubbo.config.annotation.Service;
import com.sdydj.bean.UmsMemberReceiveAddress;

import com.sdydj.service.UmsMemberReceiveAddressService;
import com.sdydj.user.mapper.UmsMemberReceiveAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;

import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
class UmsMemberReceiveAddressMapperAddressService implements UmsMemberReceiveAddressService {

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;
    @Override
    public List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByUmsMember(String id) {
        Example e = new Example(UmsMemberReceiveAddress.class);
        e.createCriteria().andEqualTo("memberId",id);
        return umsMemberReceiveAddressMapper.selectByExample(e);
    }
}
