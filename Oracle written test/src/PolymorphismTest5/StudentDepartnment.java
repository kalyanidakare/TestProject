package PolymorphismTest5;

import java.util.Scanner;

public class StudentDepartnment {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
    
		int rollno;
		String name;
        int id;
		String dname;
		Department d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rollno,name,id,dname");
		
		rollno = sc.nextInt();
		name = sc.next();
        id = sc.nextInt();
		dname = sc.next();
		
		Department d1 = new Department();
		d1.setId(id);
		d1.setDname(dname);

		Student s1 = new Student();
		s1.setRollno(rollno);
		s1.setName(name);
		s1.setD(d1);

		System.out.print(s1);

	}
}
