package utils;

public class Page {
	private int pageNo;
	private int pageSum;
	private int pageCount;
	private int pageSize;
	
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSum() {
		if(pageCount%pageSize==0){
			this.pageSum = pageCount/pageSize;
		}else{
			this.pageSum = pageCount/pageSize+1;
		}
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
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	
}
