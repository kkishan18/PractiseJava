package com.Sb101;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Generick {
	

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of elements in the list: ");
	        int numElements = scanner.nextInt();

	        System.out.print("Enter the elements (integer values): ");
	        List<Integer> integerList = createGenericList(scanner, numElements);

	        System.out.println("Generic List:");
	        printList(integerList);
	    }

	    public static <T> List<T> createGenericList(Scanner scanner, int numElements) {
	        List<T> list = new ArrayList<>();
	        for (int i = 0; i < numElements; i++) {
	            T element = (T) scanner.next(); // Casting to generic type T
	            list.add(element);
	        }
	        return list;
	    }

	    public static <T> void printList(List<T> list) {
	        for (T element : list) {
	            System.out.println(element);
	        }
	    }
	}


