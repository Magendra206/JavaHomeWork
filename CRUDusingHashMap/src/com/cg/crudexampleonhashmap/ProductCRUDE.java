package com.cg.crudexampleonhashmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ProductCRUDE {

	HashMap<String, Product> listOfProducts = new HashMap<String, Product>();
	Product product;
	int noOfProducts;
	Scanner scan = new Scanner(System.in);
	 char ch ='y';
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
					System.out.println("sortbyname: to sort the product list by name");
					System.out.println("sortbypriceasc: to sort the product list by price low to high");
					System.out.println("sortbypricedesc: to sort the product list by price high to low");
					scan.nextLine();
					String choice = scan.nextLine();
					switch (choice) {
					case "add":
						addProduct();
						break;
					case "update":
						updateProductByName();
						break;
					case "delete":
						//deleteProduct();
						deleteProductUsingName();
						break;
					case "display":
						displayProduct();
						break;
					case "search":
						searchProductByName();
						break;
					case "sortbyname":
						sortProductByName();
						break;
					case "sortbypriceasc":
						sortByPriceAsc();
						break;
					case"sortbypricedesc":
						sortByPriceDsc();
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
	 /**
	  * delete product using name
	 * @throws ProductNotFoundException 
	  */
	 private void deleteProductUsingName() throws ProductNotFoundException {
		 Product product =  searchProductByName();
			
			String productkey = findProductKey(product);
			
			if(product == null) {
				throw new ProductNotFoundException("Product not found....");
			}else {
				
				listOfProducts.remove(productkey,product);
				
			}
		
	}
	/**
	  * update product by name
	 * @throws ProductNotFoundException 
	  */
	 private void updateProductByName() throws ProductNotFoundException {
		 Product product =  searchProductByName();
			
			if(product == null) {
				throw new ProductNotFoundException("Product not found....");
			}else {
				System.out.println("Enter the details to update (if necessary else enter the previous values");
				readProductDetails();
			}
		
	}
	 Entry<String,Product> productEntry = null;
		private String findProductKey(Product product) {
			String foundkey = null;
			
			Set<Entry<String, Product>> productEntrySets = listOfProducts.entrySet();
			Iterator<Entry<String, Product>> productItr = productEntrySets.iterator();
			while(productItr.hasNext()) {
				productEntry = productItr.next();
				if(productEntry.getValue().equals(product)) {
					foundkey =  productEntry.getKey();
				}
			}
			System.out.println(productEntrySets);
			return foundkey;
		}
		Product foundProduct = null;
	private Product searchProductByName() {
		System.out.println("Enter the name of the product to search");
		String searchPName = scan.nextLine();
		prodObj = listOfProducts.values();
		Iterator<Product> productItr = prodObj.iterator();
		while(productItr.hasNext()) {
			foundProduct = productItr.next();
			if(foundProduct.getProductName().equals(searchPName)) {
				System.out.println("Product FOund...");
				break;
			}
		}
		System.out.println("Product Details are.....");
		System.out.println("Product Id = " + foundProduct.getProductId());
		System.out.println("Product Id = " + foundProduct.getProductName());
		System.out.println("Product Id = " + foundProduct.getProductPrice());
		System.out.println("Product Id = " + foundProduct.getProductCategory());
		return foundProduct;
	}
	/**
	  * sort the product price by ascending order
	  */
	 private void sortByPriceDsc() {
		 System.out.println("Before Sorted List .........");
			displayProduct();
			prodObj = listOfProducts.values();
			ArrayList<Product> prodList = new ArrayList<Product>();
			prodList.addAll(prodObj);
			Collections.sort(prodList, new PriceComparatorbyasc().reversed());
			//Collections.sort(prodList, new PriceComparatorbydsc());
			System.out.println("Sorted List .........");
			System.out.println("Product Id" + "\t" + "Product Name " + "\t" + "Product Price " +"\t" +"Product Category");
			for(Product product : prodList) {
				System.out.println(product.getProductId() + "\t" + product.getProductName() + "\t" + product.getProductPrice() +"\t" +product.getProductCategory());

			}
		
		
	}
	private void sortByPriceAsc() {
		System.out.println("Before Sorted List .........");
		displayProduct();
		prodObj = listOfProducts.values();
		ArrayList<Product> prodList = new ArrayList<Product>();
		prodList.addAll(prodObj);
		Collections.sort(prodList, new PriceComparatorbyasc());
		System.out.println("Sorted List .........");
		System.out.println("Product Id" + "\t" + "Product Name " + "\t" + "Product Price " +"\t" +"Product Category");
		for(Product product : prodList) {
			System.out.println(product.getProductId() + "\t" + product.getProductName() + "\t" + product.getProductPrice() +"\t" +product.getProductCategory());

		}
		
		
	}
	/**
	  * sort product by name using namecomparator
	  */
	 private void sortProductByName() {
		 System.out.println("Before Sorted List .........");
			displayProduct();
			prodObj = listOfProducts.values();
			ArrayList<Product> prodList = new ArrayList<Product>();
			prodList.addAll(prodObj);
			Collections.sort(prodList, new NameComparator());
			System.out.println("Sorted List .........");
			System.out.println("Product Id" + "\t" + "Product Name " + "\t" + "Product Price " +"\t" +"Product Category");
			for(Product product : prodList) {
				System.out.println(product.getProductId() + "\t" + product.getProductName() + "\t" + product.getProductPrice() +"\t" +product.getProductCategory());

			}
		
	}

	Collection<Product> prodObj = null;
	 /**
	  *  displaying the product details
	  */
	 private void displayProduct() {
		 prodObj = listOfProducts.values();
		 System.out.println(prodObj);
		 System.out.println("List of all products");
		 System.out.println("productId"+ "\t" +"productName" + "\t" +"productPrice" + "\t" +"productCategory");
		 for(Product product:prodObj)
		 {
			 System.out.println(product.getProductId()+ "\t" +product.getProductName()+ "\t" +product.getProductPrice()+ "\t" +product.getProductCategory());
		 }
		
	}

	/**
	 *  adding product details into HashMap
	 */
	private void addProduct() {
		System.out.println("Enter the size of the products");
		noOfProducts = scan.nextInt();
		System.out.println("Enter the product details");
		for(int i=0;i<noOfProducts;i++)
		{
			product = new Product();
			readProductDetails();
			System.out.println("Enter the Barcode of the product..");
			String barcode = scan.next();
			listOfProducts.put(barcode,product);
			System.out.println(listOfProducts);
			
		}
		
	}
	
	/**
	 *  reading product details
	 */
	private void readProductDetails() {
		try {
			System.out.println("Enter the Product data......");
			System.out.println("Enter the Product Id.....");
			product.setProductId(scan.nextInt());
			System.out.println("Enter the Product Name.....");
			scan.nextLine();// throw away the newline read by scanner
			product.setProductName(scan.nextLine());
			System.out.println("Enter the Product Price......");
			product.setProductPrice(scan.nextInt());
			if (validate(product.getProductPrice())) {
				System.out.println("Thank you for providing correct price.....");
			} else {
				System.out.println("Enter valid price");
			}
			System.out.println("Enter the Product Category....");
			scan.nextLine();// throw away the newline read by scanner
			product.setProductCategory(scan.nextLine());
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}
	
	//validating product price
	private boolean validate(int pPrice) throws PriceNotValidException {
		if(pPrice<=0) {
			throw new PriceNotValidException("Price cannot be less than zero");
		}else
		{
			return true;
		}
		
	}

}
