package com.xulizhi.demo.exception;

import com.xulizhi.demo.enums.ResultEnum;

/**
 * @author lenovo
 */
public class BaseException extends RuntimeException{

    private Integer code;

    public BaseException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
