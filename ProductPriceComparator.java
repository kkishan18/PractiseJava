package com.Sb101;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		return  o1.getProductPrice() > o2.getProductPrice() ? +1:-1;
	}

}
