package cn.bdqn.exam.po;

public class Option {
    private Integer oid;

    private String oname;

    private String ocountent;

    private Integer answerid;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname == null ? null : oname.trim();
    }

    public String getOcountent() {
        return ocountent;
    }

    public void setOcountent(String ocountent) {
        this.ocountent = ocountent == null ? null : ocountent.trim();
    }

    public Integer getAnswerid() {
        return answerid;
    }

    public void setAnswerid(Integer answerid) {
        this.answerid = answerid;
    }
}