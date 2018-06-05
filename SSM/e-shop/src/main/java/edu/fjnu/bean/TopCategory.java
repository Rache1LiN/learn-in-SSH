package edu.fjnu.bean;

import java.util.List;

public class TopCategory {

	private int topId;
	private String topName;
	private List<SubCategory> subList;
	public int getTopId() {
		return topId;
	}
	public void setTopId(int topId) {
		this.topId = topId;
	}
	public String getTopName() {
		return topName;
	}
	public void setTopName(String topName) {
		this.topName = topName;
	}
	public List<SubCategory> getSubList() {
		return subList;
	}
	public void setSubList(List<SubCategory> subList) {
		this.subList = subList;
	}
	
}
