package com.scistor.service.impl;

import com.scistor.dao.TestDao;
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
 * @date: 2019-04-28 18:10
 * @version: v1.0
 */
@Service
public class DemoTestServiceImpl implements DemoTestService {
    @Autowired
    private TestDao testDao;


    public List testPOST() {
        return testDao.findById("934613") ;
    }

    public String testGET() {
        return "testGET : success" ;
    }
}
