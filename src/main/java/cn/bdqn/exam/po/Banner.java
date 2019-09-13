package cn.bdqn.exam.po;

public class Banner {
    private Integer banid;

    private String banpath;

    private String banname;

    public Integer getBanid() {
        return banid;
    }

    public void setBanid(Integer banid) {
        this.banid = banid;
    }

    public String getBanpath() {
        return banpath;
    }

    public void setBanpath(String banpath) {
        this.banpath = banpath == null ? null : banpath.trim();
    }

    public String getBanname() {
        return banname;
    }

    public void setBanname(String banname) {
        this.banname = banname == null ? null : banname.trim();
    }
}