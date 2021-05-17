package com.jk.entity;

/**
* @Author: SJD
* @Description:
* @Date: 2021/5/17 22:33
* @Param:
* @Return: 
**/
public class BookEntity {

    //   员工表：id、姓名、密码、职位、部门、薪资、座右铭
    //   职位表：id、职位名称
    //   部门表：id、部门名称

    private Integer id;
    private String name;
    private String mima;
    private Integer zhiweiid;
    private Integer bumenid;
    private Integer price;
    private String zuoyouming;

    private String zhiwei;
    private String bumen;
    private Integer page;
    private Integer rows;
    private Integer kaishi;
    private Integer jieshu;

    @Override
    public String toString() {
        return "BookEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mima='" + mima + '\'' +
                ", zhiweiid=" + zhiweiid +
                ", bumenid=" + bumenid +
                ", price=" + price +
                ", zuoyouming='" + zuoyouming + '\'' +
                ", zhiwei='" + zhiwei + '\'' +
                ", bumen='" + bumen + '\'' +
                ", page=" + page +
                ", rows=" + rows +
                ", kaishi=" + kaishi +
                ", jieshu=" + jieshu +
                '}';
    }

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
        this.name = name;
    }

    public String getMima() {
        return mima;
    }

    public void setMima(String mima) {
        this.mima = mima;
    }

    public Integer getZhiweiid() {
        return zhiweiid;
    }

    public void setZhiweiid(Integer zhiweiid) {
        this.zhiweiid = zhiweiid;
    }

    public Integer getBumenid() {
        return bumenid;
    }

    public void setBumenid(Integer bumenid) {
        this.bumenid = bumenid;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getZuoyouming() {
        return zuoyouming;
    }

    public void setZuoyouming(String zuoyouming) {
        this.zuoyouming = zuoyouming;
    }

    public String getZhiwei() {
        return zhiwei;
    }

    public void setZhiwei(String zhiwei) {
        this.zhiwei = zhiwei;
    }

    public String getBumen() {
        return bumen;
    }

    public void setBumen(String bumen) {
        this.bumen = bumen;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getKaishi() {
        return kaishi;
    }

    public void setKaishi(Integer kaishi) {
        this.kaishi = kaishi;
    }

    public Integer getJieshu() {
        return jieshu;
    }

    public void setJieshu(Integer jieshu) {
        this.jieshu = jieshu;
    }
}
