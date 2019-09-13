package cn.bdqn.exam.po;

public class Badanswer {
    private Integer badid;

    private Integer answerid;

    private Integer userid;

    private String badoption;

    public Integer getBadid() {
        return badid;
    }

    public void setBadid(Integer badid) {
        this.badid = badid;
    }

    public Integer getAnswerid() {
        return answerid;
    }

    public void setAnswerid(Integer answerid) {
        this.answerid = answerid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getBadoption() {
        return badoption;
    }

    public void setBadoption(String badoption) {
        this.badoption = badoption == null ? null : badoption.trim();
    }
}