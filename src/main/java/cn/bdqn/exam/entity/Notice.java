package cn.bdqn.exam.entity;

public class Notice {
    private Integer noticeid;
    private String ntitle;
    private String nContent;
    private String nueser;
    private String nTime;
    private Integer nstate;

    public Integer getNoticeid() {
        return noticeid;
    }

    public void setNoticeid(Integer noticeid) {
        this.noticeid = noticeid;
    }

    public String getNtitle() {
        return ntitle;
    }

    public void setNtitle(String ntitle) {
        this.ntitle = ntitle;
    }

    public String getnContent() {
        return nContent;
    }

    public void setnContent(String nContent) {
        this.nContent = nContent;
    }

    public String getNueser() {
        return nueser;
    }

    public void setNueser(String nueser) {
        this.nueser = nueser;
    }

    public String getnTime() {
        return nTime;
    }

    public void setnTime(String nTime) {
        this.nTime = nTime;
    }

    public Integer getNstate() {
        return nstate;
    }

    public void setNstate(Integer nstate) {
        this.nstate = nstate;
    }
}