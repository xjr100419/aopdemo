package com.candao.dms2.gps.controller;

import com.candao.dms2.gps.aop.RspData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lee
 */
@RestController
public class GpsController {

    private static final Logger logger = LoggerFactory.getLogger(GpsController.class);



    /**
     * 参数乱码参数
     */
    @RequestMapping("/aop")
    public RspData addOrder() {
        Map<String, String> result = new HashMap<String, String>(10);
        result.put("return","1");
        RspData rsp = new RspData();
        return rsp;
    }



}
