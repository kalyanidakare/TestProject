package Emplo1;

import java.util.ArrayList;
import java.util.Collections;


public class EmployeeprofileArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ArrayList<Employee> al=new ArrayList<>();
		
		al.add(new Employee(1, "Raj", "HR", 60000,new Profile("Maharashtra","India")));
		al.add(new Employee(12, "Rahul", "sales", 70000,new Profile("Mp","India")));
		al.add(new Employee(22, "Riya", "HR", 60000,new Profile("Gujrat","India")));
		al.add(new Employee(17, "Ramesh", "Marketing", 50000,new Profile("England","UK")));
		al.add(new Employee(6, "Anajali", "HR", 60000,new Profile("Up","India")));
		
    	Collections.sort(al);  //ascending sorting
//		Collections.reverse(al);  //descending 
		System.out.print("After Sorting");
		System.out.print(al);
	
	}

	
	

}
