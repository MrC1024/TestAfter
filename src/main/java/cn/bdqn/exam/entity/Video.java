package cn.bdqn.exam.entity;

public class Video {
    private Integer vid;

    private String vname;

    private Integer vtypeid;

    private String path;
    private Integer authorId;

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    private String lengthoftime;

    private Vtype vtype;

    private Author author;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Vtype getVtype() {
        return vtype;
    }

    public void setVtype(Vtype vtype) {
        this.vtype = vtype;
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