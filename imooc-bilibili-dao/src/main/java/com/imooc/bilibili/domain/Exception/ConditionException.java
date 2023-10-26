package com.imooc.bilibili.domain.Exception;


public class ConditionException extends RuntimeException {


    private static final Long serialVersionUID = 1L;

    private String code;


    public ConditionException(String code, String name) {
        super(name);
        this.code = code;
    }

    public ConditionException(String name) {
        super(name);
        this.code = "500";
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
