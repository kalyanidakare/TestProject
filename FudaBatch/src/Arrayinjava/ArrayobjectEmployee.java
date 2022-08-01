package Arrayinjava;

import java.util.Scanner;

public class ArrayobjectEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Employee emp[]=new Employee[2];

		for(int i=0;i<2;i++)
		{
			System.out.println("Enter"+(i+1)+"Employee details:");
			System.out.println("Enter the id");
			int id=sc.nextInt();
			System.out.println("Enter the name");
			String name=sc.next();
			System.out.println("Enter the salary");
			int salary=sc.nextInt();
            System.out.println("Enter the dept");
			String dept=sc.next();
			
			Employee e=new Employee();
			e.setId(id);
			e.setName(name);
			e.setdept(dept);
			e.setSalary(salary);
			emp[i]=e;
			
		}
		//for each loop
        	 for(Employee e:emp)//e=emp[0]
		{
			
		if((e.getDept().equals("HR")&& (e.getsalary())>30000))
			System.out.println(e) ;
		}
			}

	}


