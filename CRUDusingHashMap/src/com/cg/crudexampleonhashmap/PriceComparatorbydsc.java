package com.cg.crudexampleonhashmap;

import java.util.Comparator;

public class PriceComparatorbydsc implements Comparator<Product> {

	@Override
	public int compare(Product product1, Product product2) {
		if(product1.getProductPrice()==product2.getProductPrice())
		{
			return 0;
		}
		else if(product1.getProductPrice()>product2.getProductPrice())
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}

	

}
