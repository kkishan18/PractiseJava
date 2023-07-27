package com.Sb101;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo {
	
	public static Map<Employ, String> sortMapUsingEmployeeSalary(Map<Employ, String> originalMap) {
       
        Map<Employ, String> sortedMap = new TreeMap<>();

        sortedMap.putAll(originalMap);

        return sortedMap;
		
	}

	public static void main(String[] args) {
		
		Map<Employ, String> employeeMap = new HashMap<>();
        employeeMap.put(new Employ(1, "John", 5000), "Manager");
        employeeMap.put(new Employ(2, "Alice", 3000), "Developer");
        employeeMap.put(new Employ(3, "Bob", 4000), "Designer");
        employeeMap.put(new Employ(4, "Sarah", 6000), "Engineer");
        employeeMap.put(new Employ(5, "Mike", 2000), "Intern");
        
        
        Map<Employ, String> sortMap = sortMapUsingEmployeeSalary(employeeMap);

        for (Map.Entry<Employ, String> entry : sortMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

	}


