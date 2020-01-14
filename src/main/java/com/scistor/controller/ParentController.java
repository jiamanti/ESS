package com.scistor.controller;

import com.scistor.entity.Result;

/**
 * 功能描述:
 *
 * @program: springcloud-client
 * @description: $
 * @auther: LiJihan
 * @date: 2019-04-28 18:24
 * @version: v1.0
 */
public class ParentController {

    public Result result(String msg, int code, Object data) {
        return new Result( msg, code, data);
    }

    public Result result(String msg, int code){
        return new Result( msg,  code);
    }

}
