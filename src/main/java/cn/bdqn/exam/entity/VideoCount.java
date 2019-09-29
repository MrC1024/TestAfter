package cn.bdqn.exam.entity;

import java.io.Serializable;

public class VideoCount implements Serializable {
    private Integer vid;
    private String vname;
    private Integer vtypeid;
    private String path;
    private String lengthoftime;
    private Vtype vtype;
    private Integer curriculumId;
    private String curriculumName;
    private Integer ifSel;

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public Integer getVtypeid() {
        return vtypeid;
    }

    public void setVtypeid(Integer vtypeid) {
        this.vtypeid = vtypeid;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getLengthoftime() {
        return lengthoftime;
    }

    public void setLengthoftime(String lengthoftime) {
        this.lengthoftime = lengthoftime;
    }

    public Vtype getVtype() {
        return vtype;
    }

    public void setVtype(Vtype vtype) {
        this.vtype = vtype;
    }

    public Integer getCurriculumId() {
        return curriculumId;
    }

    public void setCurriculumId(Integer curriculumId) {
        this.curriculumId = curriculumId;
    }

    public String getCurriculumName() {
        return curriculumName;
    }

    public void setCurriculumName(String curriculumName) {
        this.curriculumName = curriculumName;
    }

    public Integer getIfSel() {
        return ifSel;
    }

    public void setIfSel(Integer ifSel) {
        this.ifSel = ifSel;
    }
}
