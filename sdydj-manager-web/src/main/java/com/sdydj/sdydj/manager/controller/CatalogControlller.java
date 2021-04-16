package com.sdydj.sdydj.manager.controller;

import com.sdydj.bean.PmsBaseCatalog1;
import com.sdydj.service.CatalogService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;
import java.util.List;

@Controller
public class CatalogControlller {
    @Reference
    CatalogService catalogService;


    @RequestMapping("getCatalog1")
    @ResponseBody
    public List<PmsBaseCatalog1> getCatalog1(){



          List<PmsBaseCatalog1> getCatalog1=catalogService.getCatalog1();
        return getCatalog1;
    }

}
