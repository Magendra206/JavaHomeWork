package com.cg.crudexampleonhashmap;

import java.util.Comparator;

public class NameComparator implements Comparator<Product>{

	@Override
	public int compare(Product product1, Product product2) {
		if((product1.getProductName().compareTo(product2.getProductName())==0))
		{
			return 0;
		}
		else if((product1.getProductName().compareTo(product2.getProductName())) > 1)
			return 1;
		else
		{
			return -1;
		}
	}

}
