package com.uek.airline.util;

import com.alibaba.fastjson.JSON;
import lombok.Data;

@Data
public class JsonResult {
    private int code;
    private String status;
    private String data;
    public String setData(Object o){
        return JSON.toJSONString(o);
    }
}
