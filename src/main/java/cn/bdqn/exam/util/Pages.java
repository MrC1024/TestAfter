package cn.bdqn.exam.util;

import cn.bdqn.exam.entity.Dept;


import java.util.List;

public class Pages {
    // 总页数
    private int pageSum;
    // 每页显示的数量
    private int pageCount = 5;
    // 当前页码
    private int pageIndex;
    // 总条数
    private int count;
    // 每页显示的内容
    private List<Dept> content;

    public List<Dept> getContent() {
        return content;
    }

    public void setContent(List<Dept> content) {
        this.content = content;
    }

    public int getPageSum() {
        return pageSum;
    }

    public void setPageSum(int pageSum) {
        this.pageSum = pageSum;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
        this.pageSum = count % pageCount == 0 ? count / pageCount : count
                / pageCount + 1;
    }

}
