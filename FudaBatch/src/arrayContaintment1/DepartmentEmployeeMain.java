package arrayContaintment1;

import java.util.Arrays;
import java.util.Scanner;

public class DepartmentEmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Department dept[] = new Department[1];

		for (int i = 0; i < 1; i++) {
			System.out.println("Enter name,totalempl list of department");
			String name = sc.next();
			int totalemp = sc.nextInt();
//    		return id+" "+ename+" "+dept+" "+salary+" "+contact+" "+address;

			Employee emp[] = new Employee[2];
			for (int j = 0; j < 2; j++) {
				System.out.println("Enter id,name,salary,contact,address");
				int id = sc.nextInt();
				String ename = sc.next();
				int salary = sc.nextInt();
				String contact = sc.next();
				String address = sc.next();

				Employee e1 = new Employee();
				e1.setId(id);
				e1.setEname(ename);
				e1.setSalary(salary);
				e1.setContact(contact);
				e1.setAddress(address);

				emp[j] = e1;

			}
			Department d1 = new Department();
			d1.setName(name);
			d1.setTotalemp(totalemp);
			d1.setEmp(emp);
			dept[i] = d1;
		}
		System.out.println(Arrays.toString(dept));
		for (Department d : dept) {
			for (Employee s : d.emp)
//	{
//		if(s.getAddress().equals("Pune") && s.getSalary()>30000)
//				{
//					System.out.println(d.name+" "+s.ename+" "+s.salary+" "+s.contact+" "+s.address);
//				}
			{
				if (s.getSalary() > 50000) {
					int bonus = (s.getSalary() * 15) / 100;
					int newSalary=s.getSalary()+bonus;
                    System.out.println(d.name + " " + s.id + " " + s.ename + " " + s.salary + " " + s.address + " " + newSalary);

//						System.out.println(d.name+" "+s.ename+" "+s.salary+" "+s.contact+" "+s.address);

				}
			}
		}
	}

}
