package com.scistor.entity;

import java.util.Date;

/**
 * 功能描述:
 *
 * @program: springcloud-parent
 * @description: $
 * @auther: LiJihan
 * @date: 2019-04-30 09:53
 * @version: v1.0
 */
public class BatNo {

    private String batNo;
    private Date createTime;


    public String getBatNo() {
        return batNo;
    }

    public void setBatNo(String batNo) {
        this.batNo = batNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
