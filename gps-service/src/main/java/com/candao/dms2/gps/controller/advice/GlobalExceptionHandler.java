package com.candao.dms2.gps.controller.advice;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 异常处理
 * @author lee
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Map<Object, Object> exception(Exception e, HttpServletRequest req) {
        Map<Object, Object> payResponse = new HashMap<Object, Object>();

        return payResponse;
    }

}
