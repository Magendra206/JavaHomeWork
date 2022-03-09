package com.cg.crudexampleonhashmap;

import java.util.Objects;
import java.util.Scanner;

public class Product {
	private int productId;
	private String productName;
	private int productPrice;
	private String productCategory;
	public Product() {

	}
	public Product(int productId, String productName, int productPrice, String productCategory) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCategory = productCategory;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productCategory=" + productCategory + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(productCategory, productId, productName, productPrice);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(productCategory, other.productCategory) && productId == other.productId
				&& Objects.equals(productName, other.productName) && productPrice == other.productPrice;
	}
	Scanner scan = new Scanner(System.in);
	public void readProductDetails() {
		 try {
			System.out.println("Enter the product data");
			System.out.println("Enter the product id");
			System.out.println("Enter the product name");
			productName = scan.nextLine();
			System.out.println("Enter the product price");
			productPrice = scan.nextInt();
			System.out.println("Enter product category");
			productCategory = scan.nextLine();
			
		 }catch (Exception e) {
			e.printStackTrace();
		}
		}
	
	
	

}
