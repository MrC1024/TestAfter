package cn.bdqn.exam.po;

public class Commodity {
    private Integer commodityid;

    private String commodityname;

    private Integer comtotal;

    public Integer getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(Integer commodityid) {
        this.commodityid = commodityid;
    }

    public String getCommodityname() {
        return commodityname;
    }

    public void setCommodityname(String commodityname) {
        this.commodityname = commodityname == null ? null : commodityname.trim();
    }

    public Integer getComtotal() {
        return comtotal;
    }

    public void setComtotal(Integer comtotal) {
        this.comtotal = comtotal;
    }
}