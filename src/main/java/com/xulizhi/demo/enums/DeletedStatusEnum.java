package com.xulizhi.demo.enums;

/**
 * @author lenovo
 */

public enum DeletedStatusEnum {

    ISDEL("已删除", 1), NOTDEL("未删除", 0);

    private String name;

    private Integer code;

    DeletedStatusEnum(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
