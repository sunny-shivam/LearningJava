package in.learning.java.impl;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		System.out.println("Shivam");

		ArrayList<Student> ar = new ArrayList<Student>();
		ar.add(new Student(102, "Sunny", "Banglore"));
		ar.add(new Student(101, "Shivam", "India"));
		ar.add(new Student(103, "Ash", "Banglore"));
		
		System.out.println("Unsorted .......");
		print(ar);
		
		Collections.sort(ar, new SortByRoll());
		print(ar);
		
		Collections.sort(ar, new SortByName());
		print(ar);
		
	}
	
	static void print(ArrayList<Student> ar) {
		for(Student stud: ar)
			System.out.println(stud);
		System.out.println("=====================================\n");
	}
	
}
