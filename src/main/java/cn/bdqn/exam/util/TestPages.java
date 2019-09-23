package cn.bdqn.exam.util;

import cn.bdqn.exam.entity.testpaper;


import java.util.List;

public class TestPages {
    // 总页数
    private int pageSum;
    // 每页显示的数量
    private int pageCount = 5;
    // 当前页码
    private int pageIndex;
    // 总条数
    private int count;
    // 每页显示的内容
    private List<testpaper> content;

    public List<testpaper> getContent() {
        return content;
    }

    public void setContent(List<testpaper> content) {
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
