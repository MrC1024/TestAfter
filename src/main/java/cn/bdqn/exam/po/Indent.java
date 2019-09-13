package cn.bdqn.exam.po;

public class Indent {
    private Integer indentid;

    private String indentname;

    public Integer getIndentid() {
        return indentid;
    }

    public void setIndentid(Integer indentid) {
        this.indentid = indentid;
    }

    public String getIndentname() {
        return indentname;
    }

    public void setIndentname(String indentname) {
        this.indentname = indentname == null ? null : indentname.trim();
    }
}