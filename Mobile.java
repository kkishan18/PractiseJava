package com.Sb101;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mobile {
	
	
	 HashMap<String, ArrayList<String>> mobiles = new HashMap<>();

    public String addMobile(String company, String model) {
        ArrayList<String> models = mobiles.getOrDefault(company, new ArrayList<>());
        models.add(model);
        mobiles.put(company, models);
        return "Mobile added successfully";
    }

    public List<String> getModels(String company) {
        return mobiles.getOrDefault(company, new ArrayList<>());
    }

    public static void main(String[] args) {
        Mobile mobile = new Mobile();

        // Add some mobiles
        mobile.addMobile("Apple", "iPhone 13");
        mobile.addMobile("Samsung", "Galaxy S21");
        mobile.addMobile("Apple", "iPhone 12");
        mobile.addMobile("OnePlus", "9 Pro");

        // Get models for a company
        List<String> appleModels = mobile.getModels("Apple");
        List<String> samsungModels = mobile.getModels("Samsung");
        List<String> invalidCompanyModels = mobile.getModels("InvalidCompany");

        // Print the models
        System.out.println("Apple models: " + appleModels);
        System.out.println("Samsung models: " + samsungModels);
        System.out.println("Invalid company models: " + invalidCompanyModels);
	
    }
    
}


