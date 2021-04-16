package com.sdydj.sdydj.manager.service.impl;

import com.sdydj.bean.PmsBaseCatalog1;
import com.sdydj.sdydj.manager.mapper.PmsBaseCatalog1Mapper;
import com.sdydj.sdydj.manager.mapper.PmsBaseCatalog2Mapper;
import com.sdydj.sdydj.manager.mapper.PmsBaseCatalog3Mapper;
import com.sdydj.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CatalogServiceImpl implements CatalogService {


 @Autowired
 PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;

 @Autowired
 PmsBaseCatalog2Mapper pmsBaseCatalog2Mapper;


 @Autowired
 PmsBaseCatalog3Mapper pmsBaseCatalog3Mapper;




 @Override
 public List<PmsBaseCatalog1> getCatalog1getCatalog1() {
  return pmsBaseCatalog1Mapper.selectAll();
 }
}
