/**
 * 
 */
package edu.fjnu.bean;

import java.io.Serializable;
import java.util.Date;


/**
 * @author ASUS
 *
 */
public class NewsCat implements Serializable{

	private static final long serialVersionUID = 2307982977517820816L;

	private Long catId;
	private String catName;
	private String catDesc;
	private Long parentId;
	
	private String status;
	private String remark;
	private Long sortNum;
	private Long isDeleted;
	
	private Long createBy;
	private Long updateBy;
	private Date createOn;
	private Date updateOn;
	public Long getCatId() {
		return catId;
	}
	public void setCatId(Long catId) {
		this.catId = catId;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public String getCatDesc() {
		return catDesc;
	}
	public void setCatDesc(String catDesc) {
		this.catDesc = catDesc;
	}
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Long getSortNum() {
		return sortNum;
	}
	public void setSortNum(Long sortNum) {
		this.sortNum = sortNum;
	}
	public Long getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Long isDeleted) {
		this.isDeleted = isDeleted;
	}
	public Long getCreateBy() {
		return createBy;
	}
	public void setCreateBy(Long createBy) {
		this.createBy = createBy;
	}
	public Long getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(Long updateBy) {
		this.updateBy = updateBy;
	}
	public Date getCreateOn() {
		return createOn;
	}
	public void setCreateOn(Date createOn) {
		this.createOn = createOn;
	}
	public Date getUpdateOn() {
		return updateOn;
	}
	public void setUpdateOn(Date updateOn) {
		this.updateOn = updateOn;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
