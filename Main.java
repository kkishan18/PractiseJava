package com.Sb101;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Queue<Product> p= new PriorityQueue<>(new ProductPriceComparator());
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < 2; i++) 
		{
		System.out.println("Enter product id");
		int productId=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter product name");
		String productName=sc.nextLine();
		
		System.out.println("Enter product price");
		int productPrice=sc.nextInt();
		
		
		Product product = new Product(productId, productName, productPrice);
        p.add(product);
		}
		
	
		
		
		Iterator<Product> pr=p.iterator();
		while(pr.hasNext()) {
			Product product = pr.next();
			
			System.out.println("==================================================");
            System.out.println("Product ID: " + product.getProductId());
            System.out.println("Product Name: " + product.getProductName());
            System.out.println("Product Price: " + product.getProductPrice());
          
		}
		
	}

}
