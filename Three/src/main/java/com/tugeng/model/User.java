package com.tugeng.model;

public class User {
    private Integer id;

    private String name;

    private String classname;

    private String sysnum;

    private Byte isTeacher;

    private Byte gender;

    private String academy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public String getSysnum() {
        return sysnum;
    }

    public void setSysnum(String sysnum) {
        this.sysnum = sysnum == null ? null : sysnum.trim();
    }

    public Byte getIsTeacher() {
        return isTeacher;
    }

    public void setIsTeacher(Byte isTeacher) {
        this.isTeacher = isTeacher;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy == null ? null : academy.trim();
    }
}