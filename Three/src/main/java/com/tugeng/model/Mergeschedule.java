package com.tugeng.model;

public class Mergeschedule {
    private Integer id;

    private String mergeSkdx;

    private String mergeKcdm;

    private String mergeKcmc;

    private String mergeSkz;

    private String mergeRkls;

    private String mergeXueqi;

    private String mergeXingqi;

    private String mergeJieci;

    private String mergeSkdd;

    private String mergeSkrs;

    private Integer teacherId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMergeSkdx() {
        return mergeSkdx;
    }

    public void setMergeSkdx(String mergeSkdx) {
        this.mergeSkdx = mergeSkdx == null ? null : mergeSkdx.trim();
    }

    public String getMergeKcdm() {
        return mergeKcdm;
    }

    public void setMergeKcdm(String mergeKcdm) {
        this.mergeKcdm = mergeKcdm == null ? null : mergeKcdm.trim();
    }

    public String getMergeKcmc() {
        return mergeKcmc;
    }

    public void setMergeKcmc(String mergeKcmc) {
        this.mergeKcmc = mergeKcmc == null ? null : mergeKcmc.trim();
    }

    public String getMergeSkz() {
        return mergeSkz;
    }

    public void setMergeSkz(String mergeSkz) {
        this.mergeSkz = mergeSkz == null ? null : mergeSkz.trim();
    }

    public String getMergeRkls() {
        return mergeRkls;
    }

    public void setMergeRkls(String mergeRkls) {
        this.mergeRkls = mergeRkls == null ? null : mergeRkls.trim();
    }

    public String getMergeXueqi() {
        return mergeXueqi;
    }

    public void setMergeXueqi(String mergeXueqi) {
        this.mergeXueqi = mergeXueqi == null ? null : mergeXueqi.trim();
    }

    public String getMergeXingqi() {
        return mergeXingqi;
    }

    public void setMergeXingqi(String mergeXingqi) {
        this.mergeXingqi = mergeXingqi == null ? null : mergeXingqi.trim();
    }

    public String getMergeJieci() {
        return mergeJieci;
    }

    public void setMergeJieci(String mergeJieci) {
        this.mergeJieci = mergeJieci == null ? null : mergeJieci.trim();
    }

    public String getMergeSkdd() {
        return mergeSkdd;
    }

    public void setMergeSkdd(String mergeSkdd) {
        this.mergeSkdd = mergeSkdd == null ? null : mergeSkdd.trim();
    }

    public String getMergeSkrs() {
        return mergeSkrs;
    }

    public void setMergeSkrs(String mergeSkrs) {
        this.mergeSkrs = mergeSkrs == null ? null : mergeSkrs.trim();
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
}