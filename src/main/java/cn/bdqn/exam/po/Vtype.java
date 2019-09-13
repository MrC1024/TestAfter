package cn.bdqn.exam.po;

public class Vtype {
    private Integer vtypeid;

    private String vtypename;

    public Integer getVtypeid() {
        return vtypeid;
    }

    public void setVtypeid(Integer vtypeid) {
        this.vtypeid = vtypeid;
    }

    public String getVtypename() {
        return vtypename;
    }

    public void setVtypename(String vtypename) {
        this.vtypename = vtypename == null ? null : vtypename.trim();
    }
}