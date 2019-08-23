package in.learning.java.impl;

import java.util.Comparator;

public class SortByRoll implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		
		return s1.rollNumber - s2.rollNumber;
	}

}
