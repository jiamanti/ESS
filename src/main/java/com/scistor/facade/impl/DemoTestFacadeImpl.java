package com.scistor.facade.impl;

import com.scistor.facade.DemoTestFacade;
import com.scistor.service.DemoTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能描述:
 *
 * @program: springcloud-client
 * @description: $
 * @auther: LiJihan
 * @date: 2019-04-28 18:09
 * @version: v1.0
 */
@Service
public class DemoTestFacadeImpl implements DemoTestFacade {

    @Autowired
    private DemoTestService demoTestService;


    @Override
    public String testPOST() {
        List list = demoTestService.testPOST();
        return list.get(0).toString();
    }

    @Override
    public String testGET() {
        return demoTestService.testGET();
    }
}
