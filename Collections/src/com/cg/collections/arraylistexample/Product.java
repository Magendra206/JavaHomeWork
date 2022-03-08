package com.cg.collections.arraylistexample;

import java.util.Scanner;

public class Product {

	private String productId;
    private String productName;
    private float productPrice;
    
    
	public Product() {

	}
	public Product(String productId, String productName, float productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	} 
	
	Scanner scan = new Scanner(System.in);
	public void readProductDetails() {
		 try {
			System.out.println("Enter the product data");
			System.out.println("Enter the product id");
			productId = scan.nextLine();
			System.out.println("Enter the product name");
			productName = scan.nextLine();
			System.out.println("Enter the product price");
			productPrice = scan.nextFloat();
			
		 }catch (Exception e) {
			e.printStackTrace();
		}
		}
		@SuppressWarnings("deprecation")
		void displayProductDetails(){
			System.out.println("Entered the product data ...............");
			System.out.println("product id = " + productId );
			System.out.println("product name = " + productName);
			System.out.println("product Price = " + productPrice);
		}
	/*public void readProductDetails(){
			System.out.println("Enter the Product Details");
			System.out.println("Enter the productId");
			String productId = scan.nextLine();
			System.out.println("Enter the Product Name");
			String productName = scan.nextLine();
			System.out.println("enter the product price");
			float productPrice = scan.nextFloat();
	}
	 void displayProductDetails()
	{
		System.out.println("productId :" +productId);
		System.out.println("productName :" +productName);
		System.out.println("productPrice :" +productPrice);
	}*/
public int compareTo(Product pt) {
			
			if(this.productId.compareTo(pt.getProductId()) == 0)
				return 0;
			else
				if(this.productId.compareTo(pt.getProductId()) > 0)
					return 1;
				else
				    return -1;
		}
	 
    
    
}
