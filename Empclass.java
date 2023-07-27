package com.Sb101;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Empclass {

	public static void main(String[] args) {

		Map<Employ,String> unsortMap=new HashMap<>();
		
		unsortMap.put(new Employ(1, "n1", 2500), "ch1");
		unsortMap.put(new Employ(2, "n2", 3500), "ch2");
		unsortMap.put(new Employ(3, "n3", 500), "ch3");
		unsortMap.put(new Employ(4, "n4", 8500), "ch3");
		
		Map<Employ, String> mpMap=new TreeMap<>(unsortMap);
		
		for(Map.Entry<Employ, String> entry: mpMap.entrySet()){
			System.out.println(entry.getKey() + ":"+ entry.getValue());
		}
	}

}
