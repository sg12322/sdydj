package com.sdydj.sdydjuser.serviceImpl;





import com.sdydj.bean.UmsMemberReceiveAddress;
import com.sdydj.sdydjuser.mapper.UmsMemberReceiveAddressMapper;
import com.sdydj.service.UmsMemberReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
