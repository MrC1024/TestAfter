package cn.bdqn.exam.entity;

import java.util.List;

public class Video {
    private Integer vid;

    private String vname;

    private Integer vtypeid;

    private String path;

    private String lengthoftime;
    private List<Comment> commentList;

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

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
        this.vname = vname == null ? null : vname.trim();
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
        this.path = path == null ? null : path.trim();
    }

    public String getLengthoftime() {
        return lengthoftime;
    }

    public void setLengthoftime(String lengthoftime) {
        this.lengthoftime = lengthoftime == null ? null : lengthoftime.trim();
    }
}