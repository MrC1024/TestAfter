package cn.bdqn.exam.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Test {
    private Integer aid;

    private String aname;


    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date testDates;
    private String key;
    private Integer testState;
    private String testpaperstepName;
    private String Aoption;
    private String Boption;
    private String Coption;
    private String Doption;

    private Float Score;

    private String Analysis;

    @Override
    public String toString() {
        return "Test{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", testDates=" + testDates +
                ", key='" + key + '\'' +
                ", testState=" + testState +
                ", testpaperstepName='" + testpaperstepName + '\'' +
                ", Aoption='" + Aoption + '\'' +
                ", Boption='" + Boption + '\'' +
                ", Coption='" + Coption + '\'' +
                ", Doption='" + Doption + '\'' +
                '}';
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public Float getScore() {
        return Score;
    }

    public void setScore(Float score) {
        Score = score;
    }

    public String getAnalysis() {
        return Analysis;
    }

    public void setAnalysis(String analysis) {
        Analysis = analysis;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public Date getTestDates() {
        return testDates;
    }

    public void setTestDates(Date testDates) {
        this.testDates = testDates;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getTestState() {
        return testState;
    }

    public void setTestState(Integer testState) {
        this.testState = testState;
    }

    public String getTestpaperstepName() {
        return testpaperstepName;
    }

    public void setTestpaperstepName(String testpaperstepName) {
        this.testpaperstepName = testpaperstepName;
    }

    public String getAoption() {
        return Aoption;
    }

    public void setAoption(String aoption) {
        Aoption = aoption;
    }

    public String getBoption() {
        return Boption;
    }

    public void setBoption(String boption) {
        Boption = boption;
    }

    public String getCoption() {
        return Coption;
    }

    public void setCoption(String coption) {
        Coption = coption;
    }

    public String getDoption() {
        return Doption;
    }

    public void setDoption(String doption) {
        Doption = doption;
    }
}