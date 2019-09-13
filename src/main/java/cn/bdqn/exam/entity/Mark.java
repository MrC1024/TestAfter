package cn.bdqn.exam.entity;

public class Mark {
    private Integer markid;

    private String mscore;

    private Integer deptid;

    private Integer userId;

    private Integer testpaperstepid;

    public Integer getMarkid() {
        return markid;
    }

    public void setMarkid(Integer markid) {
        this.markid = markid;
    }

    public String getMscore() {
        return mscore;
    }

    public void setMscore(String mscore) {
        this.mscore = mscore == null ? null : mscore.trim();
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTestpaperstepid() {
        return testpaperstepid;
    }

    public void setTestpaperstepid(Integer testpaperstepid) {
        this.testpaperstepid = testpaperstepid;
    }
}