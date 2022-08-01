package Constructor;

import java.util.Scanner;

public class Students {

	int id, marks;
	String name, dept, city, contact; // global variable

	Students() {
	}

	Students(int id, int marks, String name, String dept, String city, String contact) {
		this.id = id;
		this.marks = marks;
		this.name = name;
		this.dept = dept;
		this.city = city;
		this.contact = contact;
	}

	public String toString() {
		return id + " " + marks + "" + name + " " + dept + " " + city + " " + contact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub//read value from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks of student");
		int marks = sc.nextInt();
//call costructor
		System.out.println();
	}

}
