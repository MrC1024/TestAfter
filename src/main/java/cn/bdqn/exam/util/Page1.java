package cn.bdqn.exam.util;

import cn.bdqn.exam.entity.Banner;
import cn.bdqn.exam.entity.SelMX;

import java.util.List;


public class Page1 {
	private int pageSum;				// 总页数
	private int pageCount = 5;			// 每页显示的数量
	private int pageIndex;				// 当前页码
	private int count;					// 总条数
	private List<SelMX> content;		// 每页显示的内容

	

	public List<SelMX> getContent() {
		return content;
	}

	public void setContent(List<SelMX> content) {
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
