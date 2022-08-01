package ClassesAndObject;

import java.util.Scanner;

public class tostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id,marks; //local variable
		String name,dept,sports;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id,name,department,marks,sports:");
		id=sc.nextInt();
		name=sc.next();
		dept=sc.next();
		marks=sc.nextInt();
		sports=sc.next();
		
		Student1 s1=new Student1();
		s1.setData(id, name, dept, marks, sports);//101,raj
		
		Student1 s2=new Student1();
		System.out.println("enter the id,name,department,marks,sports:");
		id=sc.nextInt();
	     name=sc.next();
		dept=sc.next();
		marks=sc.nextInt();
		sports=sc.next();
		
		System.out.println(s1);
		s1.sportsMarks();
		System.out.println(s2);
		s2.sportsMarks();
		
		
		//Student2 s1=null;
//		for(int i=1;i<=2;i++)
//		{
//			System.out.println("enter the id,name,department,marks,sports:");
//			id=sc.nextInt();
//			name=sc.next();
//			dept=sc.next();
//			marks=sc.nextInt();
//			sports=sc.next();
//			
//			Student2 s1=new Student2();
//			s1.setData(id, name, dept, marks, sports);//101,raj
//		}
//		System.out.println(s1);
		}
		
	}