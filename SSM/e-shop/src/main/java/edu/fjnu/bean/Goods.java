package edu.fjnu.bean;

public class Goods {

	private Long goodsId;
	private String goodsName;
	private double goodsPrice;
	private double marketPrice;
	private String goodsDescription;
	private String goodsPicture;
	private SubCategory subCategory;
	public Goods(){}
	
	public Goods(Long goodsId, String goodsName, double goodsPrice,
			double marketPrice, String goodsDescription, String goodsPicture,
			SubCategory subCategory) {
		super();
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;
		this.marketPrice = marketPrice;
		this.goodsDescription = goodsDescription;
		this.goodsPicture = goodsPicture;
		this.subCategory = subCategory;
	}

	public Long getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public double getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public double getMarketPrice() {
		return marketPrice;
	}
	public void setMarketPrice(double marketPrice) {
		this.marketPrice = marketPrice;
	}
	public String getGoodsDescription() {
		return goodsDescription;
	}
	public void setGoodsDescription(String goodsDescription) {
		this.goodsDescription = goodsDescription;
	}
	public String getGoodsPicture() {
		return goodsPicture;
	}
	public void setGoodsPicture(String goodsPicture) {
		this.goodsPicture = goodsPicture;
	}
	public SubCategory getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(SubCategory subCategory) {
		this.subCategory = subCategory;
	}
	
}
