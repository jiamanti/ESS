package com.scistor.service;


import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DemoTestService {


    List testPOST();

    String testGET();
}
