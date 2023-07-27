package com.Sb101;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linked {

	public static void main(String[] args) {

		LinkedHashMap<String, String> lhm=new LinkedHashMap<>();
		
		lhm.put("India", "New Delhi");
		lhm.put("Maharashtra", "Mumbai");
        lhm.put("Tamil Nadu", "Chennai");
        lhm.put("Uttar Pradesh", "Lucknow");
        lhm.put("Gujarat", "Gandhinagar");
        
        for(Map.Entry<String, String> entry:lhm.entrySet()) {;
//        String state = entry.getKey();
//        String capital = entry.getValue();
//        System.out.println(state + capital);
        System.out.println(entry.getKey() +" : "+ entry.getValue() );
	}
		
		
	}
}
