package com.hsenidmobile.EmployeeDepartmentSpringJPA.model;

public enum DepartmentName {
    DEV("DEV"),DELIVERY("DELIVERY"),SUPPORT("SUPPORT"),HR("HR");

    private String code;

    private DepartmentName(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
