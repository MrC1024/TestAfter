package cn.bdqn.exam.entity;

public class Integral {
    private Integer commodityId;
    private String commodityName;
    private Integer comTotal;
    private Integer addfen;
    private Integer  state;
    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public Integer getComTotal() {
        return comTotal;
    }

    public void setComTotal(Integer comTotal) {
        this.comTotal = comTotal;
    }

    public Integer getAddfen() {
        return addfen;
    }

    public void setAddfen(Integer addfen) {
        this.addfen = addfen;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}