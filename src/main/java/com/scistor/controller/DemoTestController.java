package com.scistor.controller;

import com.scistor.entity.Result;
import com.scistor.facade.DemoTestFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述:
 * @program: springcloud-client
 * @description: 测试$
 * @auther: LiJihan
 * @date: 2019-04-28 18:05
 * @version: v1.0
 */
@RestController
public class DemoTestController extends ParentController{
    @Autowired
    private DemoTestFacade demoTestFacade;


    @PostMapping(value = "/testPOST")
    public Result testPOST(){
        return result(demoTestFacade.testPOST(), 0 ) ;
    }


    @GetMapping(value = "/testGET")
    public Result testGET(){
        return result(demoTestFacade.testGET(),0);
    }

}
