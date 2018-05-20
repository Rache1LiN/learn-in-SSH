/**
 * 
 */
package edu.fjnu.common;

/**
 * @author ASUS
 *
 */
public class PagerItem {

	public PagerItem() {}
		public PagerItem(Long pPageSize) {
			this.setPageSize(pPageSize);
			reset();
		}
		public PagerItem(Long pPageSize, Long pPageNum) {
			this.setPageSize(pPageSize);
			this.setPageNum(pPageNum);
			reset();
		}

		public PagerItem(Long pPageSize, Long pPageNum, Long pRowCount) {
			this.setPageSize(pPageSize);
			this.setPageNum(pPageNum);
			this.setRowCount(pRowCount);
			reset();
		}

		public PagerItem changePageSize(Long pPageSize) {
			setPageSize(pPageSize);
			return reset();
		}

		public PagerItem changePageNum(Long pPageNum) {
			setPageNum(pPageNum);
			return reset();
		}

		public PagerItem changeRowCount(Long pRowCount) {
			setRowCount(pRowCount);
			return reset();
		}

		public PagerItem reset() {
			return resetPager().resetPageNum();
		}

		public PagerItem resetPager() {
			if(pageSize< 1) {
				pageSize= 10L;
			}
			pageCount= (rowCount+ pageSize- 1) / pageSize;
			if(pageNum< 0) {
				pageNum= 1L;
			}
			if(pageCount> 1 && pageNum> pageCount) {
				pageNum= pageCount;
			}

			return this;
		}

		public Long getPageSize() {
			return pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize= pageSize;
		}

		public Long getPageNum() {
			return pageNum;
		}

		public void setPageNum(Long pageNum) {
			this.pageNum= pageNum;
		}

		public Long getRowCount() {
			return rowCount;
		}

		public void setRowCount(Long rowCount) {
			this.rowCount= rowCount;
		}

		public Long getPageCount() {
			return pageCount;
		}
		
		public void setPageCount(Long pageCount) {
			
			this.pageCount= pageCount;
		}

		private Long pageSize= 10L;

		private Long pageNum= 1L;

		private Long rowCount= 0L;

		private Long pageCount= 1L;

		private Long startNum= 0L;

		public Long getStartNum() {

			if(pageNum> 1) {
				startNum= (pageNum- 1) * pageSize;
			}
			if(startNum< 0) {
				startNum= 0L;
			}
			return startNum;
		}
		public void setStartNum(Long startNum) {
			this.startNum= startNum;
		}
		public void parsePageSize(String pPageSize) {
			if(!SysFun.isNullOrEmpty(pPageSize)) {
				pageSize= SysFun.parseLong(pPageSize, 10L);
			}
		}
		public void parsePageNum(String pPageNum) {
			if(!SysFun.isNullOrEmpty(pPageNum)) {
				pageNum= SysFun.parseLong(pPageNum, 1L);
			}
		}
		
		public static void main(String[] args) {

			System.out.println("Test");
			PagerItem pager= new PagerItem(5L, 3L).changeRowCount(100L);

			System.out.println("limit "+ pager.getStartNum() + ", "+ pager.getPageSize());
		}

		private String url= "";
		
		public String getUrl() {
			return url;
		}
		
		public void setUrl(String url) {
			this.url= url;
		}

		private String paramPageSize= "pageSize";
		private String paramPageNum= "pageNum";

		public String getParamPageSize() {
			return paramPageSize;
		}

		public void setParamPageSize(String paramPageSize) {
			this.paramPageSize= paramPageSize;
		}

		public String getParamPageNum() {
			return paramPageNum;
		}

		public void setParamPageNum(String paramPageNum) {
			this.paramPageNum= paramPageNum;
		}

		public String generalUrl_ByPageNum(Long pPageNum) {
			String str= this.url;
			if(pPageNum< 0) {
				pPageNum= 1L;
			}
			str= SysFun.resetUrlQSValue(str, getParamPageSize(), ""+ pageSize);
			str= SysFun.resetUrlQSValue(str, getParamPageNum(), ""+ pPageNum);
			return str;
		}

		public PagerItem changeUrl(String pUrl) {
			this.url= pUrl;
			resetPageUrl();
			return this;
		}

		public PagerItem resetPageNum() {
			firstPageNum= 1L;
			
			lastPageNum= pageCount;
			
			prevPageNum= pageNum- 1;
			if(prevPageNum< firstPageNum) {
				prevPageNum= 1L;
			}

			nextPageNum= pageNum+ 1;
			if(nextPageNum> lastPageNum) {
				nextPageNum= lastPageNum;
			}

			return this;
		}

		public PagerItem resetPageUrl() {
			resetPageNum();
			firstPageUrl= generalUrl_ByPageNum(firstPageNum);
			lastPageUrl= generalUrl_ByPageNum(lastPageNum);
			prevPageUrl= generalUrl_ByPageNum(prevPageNum);
			nextPageUrl= generalUrl_ByPageNum(nextPageNum);
			return this;
		}

		private Long firstPageNum= 1L;
		private Long lastPageNum= 1L;
		private Long prevPageNum= 1L;
		private Long nextPageNum= 1L;
		private String firstPageUrl;
		private String lastPageUrl;
		private String prevPageUrl;
		private String nextPageUrl;

		public Long getFirstPageNum() {
			return firstPageNum;
		}

		public void setFirstPageNum(Long firstPageNum) {
			this.firstPageNum= firstPageNum;
		}

		public Long getLastPageNum() {
			return lastPageNum;
		}

		public void setLastPageNum(Long lastPageNum) {
			this.lastPageNum= lastPageNum;
		}

		public Long getPrevPageNum() {
			return prevPageNum;
		}

		public void setPrevPageNum(Long prevPageNum) {
			this.prevPageNum= prevPageNum;
		}

		public Long getNextPageNum() {
			return nextPageNum;
		}

		public void setNextPageNum(Long nextPageNum) {
			this.nextPageNum= nextPageNum;
		}

		public String getFirstPageUrl() {
			return firstPageUrl;
		}

		public void setFirstPageUrl(String firstPageUrl) {
			this.firstPageUrl= firstPageUrl;
		}

		public String getLastPageUrl() {
			return lastPageUrl;
		}

		public void setLastPageUrl(String lastPageUrl) {
			this.lastPageUrl= lastPageUrl;
		}

		public String getPrevPageUrl() {
			return prevPageUrl;
		}

		public void setPrevPageUrl(String prevPageUrl) {
			this.prevPageUrl= prevPageUrl;
		}

		public String getNextPageUrl() {
			return nextPageUrl;
		}

		public void setNextPageUrl(String nextPageUrl) {
			this.nextPageUrl= nextPageUrl;
		}

}
