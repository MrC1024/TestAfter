package cn.bdqn.exam.entity;

import java.io.Serializable;

public class SelMX implements Serializable {
    private int indentId;
    private String commodityName;
    private String userName;
    private int commodityId;
    private int comTotal;
    private int indentName;
    private int studentName;
    private int costIntegral;
    private int user_id;
    private int points;
    private Integer ifSel;

    public Integer getIfSel() {
        return ifSel;
    }

    public void setIfSel(Integer ifSel) {
        this.ifSel = ifSel;
    }

    public int getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(int commodityId) {
        this.commodityId = commodityId;
    }

    public int getComTotal() {
        return comTotal;
    }

    public void setComTotal(int comTotal) {
        this.comTotal = comTotal;
    }

    public int getIndentId() {
        return indentId;
    }

    public void setIndentId(int indentId) {
        this.indentId = indentId;
    }

    public int getIndentName() {
        return indentName;
    }

    public void setIndentName(int indentName) {
        this.indentName = indentName;
    }

    public int getStudentName() {
        return studentName;
    }

    public void setStudentName(int studentName) {
        this.studentName = studentName;
    }

    public int getCostIntegral() {
        return costIntegral;
    }

    public void setCostIntegral(int costIntegral) {
        this.costIntegral = costIntegral;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
