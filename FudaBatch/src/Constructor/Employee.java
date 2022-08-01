package Constructor;

import java.util.Scanner;

public class Employee {

	int id, salary;
	String firstname, lastname, dept, design;

	Employee() {
	}

	void setId(int id) {
		this.id = id;
	}

	int getId() {
		return id;
	}

	void setFirstName(String firstname) {
		this.firstname = firstname;
	}

	String getFirstName() {
		return firstname;
	}

	public String toString() {
		return id + " " + firstname + " " + lastname + " " + dept + " " + design + " " + salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id, salary; // local variable
		String firstname, lastname, dept, design;
		Scanner sc = new Scanner(System.in);

		Employee e1 = new Employee();
        System.out.println("enter the id,firstname,lastname,dept,design,salary");
		id = sc.nextInt();
		firstname = sc.next();
		lastname = sc.next();
		dept = sc.next();
		design = sc.next();
		salary = sc.nextInt();

		e1.setId(id);
		e1.setFirstName(firstname);
		e1.setFirstName(lastname);
	    e1.setDept(dept);
        e1.setDesign(design);
		e1.setSalary(salary);

		System.out.println(e1);

	}

	private void setDept(String dept2) {
		// TODO Auto-generated method stub
		
	}

	private void setDesign(String design2) {
		// TODO Auto-generated method stub
		
	}

	private void setSalary(int salary2) {
		// TODO Auto-generated method stub
		
	}
	}

	


	


