package cn.bdqn.exam.util;

import cn.bdqn.exam.entity.Banner;

import java.util.List;



public class Page {
	private int pageSum;				// 总页数
	private int pageCount = 5;			// 每页显示的数量
	private int pageIndex;				// 当前页码
	private int count;					// 总条数
	private List<Banner> content;		// 每页显示的内容

	

	public List<Banner> getContent() {
		return content;
	}

	public void setContent(List<Banner> content) {
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
