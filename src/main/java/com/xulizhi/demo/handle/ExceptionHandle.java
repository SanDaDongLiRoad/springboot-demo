package com.xulizhi.demo.handle;

import com.xulizhi.demo.domain.Result;
import com.xulizhi.demo.exception.BaseException;
import com.xulizhi.demo.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lenovo
 */
@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Result handle(Exception e){
        if(e instanceof BaseException){
            BaseException baseException = (BaseException) e;
            return ResultUtil.error(baseException.getCode(), baseException.getMessage());
        }else{
            logger.error("【系统异常】{}", e);
            return ResultUtil.error(-1, "未知错误");
        }
    }
}
