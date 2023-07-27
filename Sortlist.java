package com.Sb101;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Sortlist {

	public static void main(String[] args) {
	
		Map<String, List> mpl=new TreeMap<>(Comparator.reverseOrder());
		
		mpl.put("Tamil Naidu", Arrays.asList("hy","amirpey"));
		mpl.put("Chennai", Arrays.asList("hy","amirpey"));
		mpl.put("Zerika", Arrays.asList("hy","amirpey"));
		mpl.put("Absutan", Arrays.asList("hy","amirpey"));
		
		for(Map.Entry<String, List> entry: mpl.entrySet()) {
			System.out.println(entry.getKey()+ ":" + entry.getValue());
		}
		
	
	}

}
