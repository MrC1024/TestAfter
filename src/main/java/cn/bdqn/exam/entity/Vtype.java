package cn.bdqn.exam.entity;

public class Vtype {
    private Integer curriculumId;
    private String curriculumName;
    private Integer ifSel;
    public Integer getIfSel() {
        return ifSel;
    }
    public void setIfSel(Integer ifSel) {
        this.ifSel = ifSel;
    }

    public String getCurriculumName() {
        return curriculumName;
    }

    public void setCurriculumName(String curriculumName) {
        this.curriculumName = curriculumName;
    }

    public Integer getCurriculumId() {
        return curriculumId;
    }

    public void setCurriculumId(Integer curriculumId) {
        this.curriculumId = curriculumId;
    }


}