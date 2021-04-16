package com.sdydj.service;



import com.sdydj.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UmsMemberReceiveAddressService {
    List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByUmsMember(String id);
}
