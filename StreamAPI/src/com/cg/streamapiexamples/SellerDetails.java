package com.cg.streamapiexamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SellerDetails {

	public static void main(String[] args) {
List<Seller> sellerList = new ArrayList<Seller>();
		
		//create and Add the sellers in to above arraylist
		sellerList.add(new Seller(123,"Rama", "ram@gmail.com","Electronics",50));
		sellerList.add(new Seller(124,"Raja", "raj@gmail.com","Stationary",100));
		sellerList.add(new Seller(125,"Rana", "rana@gmail.com","Food Items",150));
		sellerList.add(new Seller(126,"Raka", "raka@gmail.com","Electronics",23));
		sellerList.add(new Seller(127,"Raza", "raza@gmail.com","Food Items",27));
		sellerList.add(new Seller(128,"Raima", "raima@gmail.com","Medicine",300));
		
		System.out.println("Seller Details are........");
		//print seller details using for each loop
		for (Seller seller : sellerList) {
			System.out.println(seller.getSellerId() + "\t" + seller.getSellerName() + "\t" + seller.getSellerEmail()
														+"\t" + seller.getSellerCategory());
		}
		
		List<Seller> electronicsCategoryList = sellerList.stream()
																.filter(seller -> (seller.getSellerCategory()).equals("Electronics"))
																.collect(Collectors.toList());
	
		System.out.println("Seller Details who belongs to Electronics category........");
		//print seller details using for each loop
		for (Seller seller : electronicsCategoryList) {
			System.out.println(seller.getSellerId() + "\t" + seller.getSellerName() + "\t" + seller.getSellerEmail()
														+"\t" + seller.getSellerCategory());
		}
	
		
		List<String> sellersEmailList = sellerList.stream()
												   .map(seller -> seller.getSellerEmail())
												   .collect(Collectors.toList());
		System.out.println("Seller Details who belongs to Electronics category........");
		//print seller details using for each loop
		for (String sellerEmail : sellersEmailList) {
			System.out.println(sellerEmail);
		}
		
		
		// add 200 bonus commissiion for all sellers
		List<Float> sellersCommissionData =
				sellerList.stream().map(seller -> seller.getSellerCommission() + 200)
									.collect(Collectors.toList());
		System.out.println("Seller Updated Commision Details........");
		//print seller details using for each loop
		for (float sellerComm : sellersCommissionData) {
			System.out.println(sellerComm);
		}
		
		System.out.println("map and filter and foreach");
		sellerList.stream().filter(seller -> seller.getSellerCommission() < 100).map(seller -> seller.getSellerCommission() + 200)
												.forEach(sellerComm -> System.out.println(sellerComm));
		System.out.println("filter and foreach");
		sellerList.stream().filter(seller -> seller.getSellerCommission() < 100).
							forEach(seller -> System.out.println(seller.getSellerName() + "\t" + seller.getSellerCommission()));
		

	}

}
