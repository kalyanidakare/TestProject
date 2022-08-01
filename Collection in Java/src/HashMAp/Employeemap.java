package HashMAp;

import java.util.HashMap;

public class Employeemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Employee, Integer> hm = new HashMap<>();

		hm.put(new Employee(101, "Ranu", "HR"), 60000);
		hm.put(new Employee(102, "Ravina", "manager"), 70000);
		hm.put(new Employee(103, "Meena", "clerk"), 50000);
		hm.put(new Employee(104, "Reena", "Principle"), 75000);
		hm.put(new Employee(105, "Ramesh", "manager"), 70000);
		hm.put(new Employee(101, "Ranu", "HR"), 60000);

		System.out.println(hm);
	}
}
