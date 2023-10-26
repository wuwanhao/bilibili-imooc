package com.imooc.bilibili.api;

import com.imooc.bilibili.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApi {


    @Autowired
    private DemoService demoService;


    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public Long query(Long id) {
        return demoService.query(id);
    }


}
