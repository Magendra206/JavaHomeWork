package com.cg.collections.arraylistexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductCRUD {
	ArrayList<Product> listOfProducts = new ArrayList<Product>();
	Product product ;
	int noOfProducts;
	Scanner scan = new Scanner(System.in);
	char ch = 'y';
	
	public void menu()
	{
		try {
			while(ch =='y')
			{
				System.out.println("Enter the choice .....");
				System.out.println("add : to add product in the array");
				System.out.println("update:to update product in the array");
				System.out.println("delete:to delete product in the array");
				System.out.println("display: to display all product");
				System.out.println("search: to search for a product");
				scan.nextLine();
				String choice = scan.nextLine();
				switch (choice) {
				case "add":
					addProduct();
					break;
				case "update":
					updateProduct();
					break;
				case "delete":
					deleteProduct();
					break;
				case "display":
					displayProduct();
					break;
				case "search":
					searchProduct();
					break;
				case "sort":
					sortProduct();
					break;
				default:
					System.out.println("Not a proper choice");
					break;
				}
				System.out.println("do you want to continue....");
				System.out.println("Enter 'y' to continue ......");
				ch = scan.next().charAt(0);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private void sortProduct() {
		//Collections.sort(listOfProducts);
		System.out.println(listOfProducts);
		
		
	}

	private Product searchProduct() {
		System.out.println("Enter the product details to search...");
		System.out.println("Enter the product id to search...");
		String pId = scan.nextLine();
		for (int i = 0; i < listOfProducts.size(); i++) {
			if(listOfProducts.get(i).getProductId().equals(pId)) {
				product = listOfProducts.get(i);
				System.out.println("Product Id" + "\t" + "Product Name" + "\t" + "Product price");
				System.out.println(listOfProducts.get(i).getProductId() + "\t\t" +listOfProducts.get(i).getProductName() + "\t\t" +listOfProducts.get(i).getProductPrice() );
			}
		}
		return product;
		
		
	}

	private void displayProduct() {
		System.out.println("product details to display.....");
		System.out.println("product Id" + "\t" + "productName" + "\t" + "productPrice");
		for (int i = 0; i < listOfProducts.size(); i++) {	
			System.out.println(listOfProducts.get(i).getProductId() + "\t\t" +listOfProducts.get(i).getProductName()+ "\t\t" +listOfProducts.get(i).getProductPrice() );
		}
		
	}

	private void deleteProduct() {
		System.out.println("Enter the product details to delete");
		System.out.println("Enter the product id to delete");
		String pId = scan.nextLine();
	
		for (int i = 0; i < listOfProducts.size(); i++) {
			if(listOfProducts.get(i).getProductId().equals(pId)) {
				Product p = listOfProducts.get(i);
				System.out.println(p);
				if(listOfProducts.remove(p)) {
					System.out.println("product removed successfully");
				}else {
					System.out.println("product Not removed");
				}
				
			}
				
		}	
		
	}

	private void updateProduct() {
		Product product1 = searchProduct();
		if(product1 != null) {
			System.out.println("Enter the details to Modify .......");
			product1.readProductDetails();
		}
		
		
		
	}

	private void addProduct() {
		System.out.println("enter the no of products");
		noOfProducts = scan.nextInt();
		System.out.println("Enter the product details");
		for(int i=0;i<noOfProducts;i++)
		{
			product = new Product();
			product.readProductDetails();
			listOfProducts.add(product);
			System.out.println(listOfProducts);
			
		}
		
	}

}
