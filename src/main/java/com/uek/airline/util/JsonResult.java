package com.uek.airline.util;

import com.alibaba.fastjson.JSON;
import lombok.Data;

@Data
public class JsonResult {
    private int code;
    private String msg;
    private String data;
    public void setData(Object o) {
        this.data = JSON.toJSONString(o);
    }
}
