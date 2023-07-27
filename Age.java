package com.Sb101;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Age {
	
	public static void exactAge(String bornDate) {
		DateTimeFormatter dateFormatter= DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate startdate=null;
    	LocalDate enddate=LocalDate.now();
		
		try {
			
			startdate =LocalDate.parse(bornDate, dateFormatter);
			
			
		} catch (Exception e) {
            System.out.println("Please enter the date in correct format (dd-MM-yyyy)");
            return; 
		}
		
		 long age = ChronoUnit.YEARS.between(startdate, enddate);

	        System.out.println("Your age is: " + age + " years");
			
	}

	public static void main(String[] args) {
        System.out.println("Please enter the date in correct format (dd-MM-yyyy)");
        Scanner scanner=new Scanner(System.in);
        String dob=scanner.nextLine();
        exactAge(dob);
	}

}
