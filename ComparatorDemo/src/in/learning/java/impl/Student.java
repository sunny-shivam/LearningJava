package in.learning.java.impl;

public class Student {
	
	int rollNumber;
	String name, address;
	
	public Student(int rollNumber, String name, String address) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
