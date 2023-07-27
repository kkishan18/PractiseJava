package com.Sb101;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ImportQuest {

	public static void main(String[] args) {

		Map<String, Student> hmMap=new HashMap<>();
		

		hmMap.put("Delhi", new Student(1, "Sam", 450));
		hmMap.put("Mumbai", new Student(2, "Era", 150));
		hmMap.put("Chennai", new Student(3, "Ram", 250));
		hmMap.put("Pune", new Student(4, "Titu", 50));
		
		Set<Entry<String, Student>> entrry= hmMap.entrySet();
		
		List<Entry<String, Student>> list=new ArrayList<>(entrry);
		
		Collections.sort(list, (o1, o2) -> o1.getValue().getMarks() > o2.getValue().getMarks() ? +1:-1);
		
		for(Map.Entry<String, Student> mp:list) {
			System.out.println(mp.getKey() + ":"+ mp.getValue());
		};
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("========================================");
		System.out.println("By Using Iterator");
		System.out.println();
		
		
		Iterator<Entry<String, Student>> iterator= list.iterator();
		while(iterator.hasNext()) {
			Entry<String, Student> entry=iterator.next();
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
	}

}
