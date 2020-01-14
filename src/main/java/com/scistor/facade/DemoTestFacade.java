package com.scistor.facade;

import org.springframework.stereotype.Component;

/**
 * 功能描述:
 *
 * @program: springcloud-client
 * @description: $
 * @auther: LiJihan
 * @date: 2019-04-28 18:05
 * @version: v1.0
 */
@Component
public interface DemoTestFacade {

    String testPOST();

    String testGET();
}
