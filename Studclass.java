package com.Sb101;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Studclass {

	public static void main(String[] args) {
     
		TreeMap<Student,String> st=new TreeMap<>(new StudentMarks());
//		TreeMap<String,Student> st=new TreeMap<>(new StudentMarks());
		
		Student s1=new Student(1, "n1", 450);
		Student s2=new Student(2, "n2", 50);
		Student s3=new Student(3, "n3", 150);
		Student s4=new Student(4, "n4", 350);
		
		
		st.put(s1, "U.P");
		st.put(s2, "Mumbai");
		st.put(s3, "m.p");
		st.put(s4, "UttarPradesh");
		
//		st.put("U.P",s1);
//		st.put("Mumbai",s2);
//		st.put("m.p",s3);
//		st.put("UttarPradesh",s4);
	
		 for (Map.Entry<Student,String> entry : st.entrySet()) {
	            System.out.println(entry.getValue()+" : " + entry.getKey());
	        }
		
     
	}

}
