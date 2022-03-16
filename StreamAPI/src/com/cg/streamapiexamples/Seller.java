package com.cg.streamapiexamples;

public class Seller {
	private int sellerId;
	private String sellerName;
	private String sellerEmail;
	private String sellerCategory;
	private float sellerCommission;
	
	public Seller() {
		// TODO Auto-generated constructor stub
	}

	public Seller(int sellerId, String sellerName, String sellerEmail, String sellerCategory) {
		super();
		this.sellerId = sellerId;
		this.sellerName = sellerName;
		this.sellerEmail = sellerEmail;
		this.sellerCategory = sellerCategory;
	}
	
	

	public Seller(int sellerId, String sellerName, String sellerEmail, String sellerCategory, float sellerCommission) {
		super();
		this.sellerId = sellerId;
		this.sellerName = sellerName;
		this.sellerEmail = sellerEmail;
		this.sellerCategory = sellerCategory;
		this.sellerCommission = sellerCommission;
	}

	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerEmail() {
		return sellerEmail;
	}

	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}

	public String getSellerCategory() {
		return sellerCategory;
	}

	public void setSellerCategory(String sellerCategory) {
		this.sellerCategory = sellerCategory;
	}



	public float getSellerCommission() {
		return sellerCommission;
	}

	public void setSellerCommission(float sellerCommission) {
		this.sellerCommission = sellerCommission;
	}

	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + ", sellerName=" + sellerName + ", sellerEmail=" + sellerEmail
				+ ", sellerCategory=" + sellerCategory + ", sellerCommission=" + sellerCommission + "]";
	}

}
