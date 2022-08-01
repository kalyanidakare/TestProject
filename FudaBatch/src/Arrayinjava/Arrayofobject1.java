package Arrayinjava;

import java.util.Scanner;

public class Arrayofobject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//by using getter setter method
		Students stud[]=new Students[5];
		Scanner sc=new Scanner(System.in);

		for(int i=0;i<1;i++)
		{
			System.out.println("Enter"+(i+1)+"Student details:");
			System.out.println("Enter the id");
			int id=sc.nextInt();
			System.out.println("Enter the name");
			String name=sc.next();
			System.out.println("Enter the departmet");
			String dept=sc.next();
			System.out.println("Enter the marks:");
			int marks=sc.nextInt();
			
			Students s=new Students();
			s.setId(id);
			s.setName(name);
			s.setDept(dept);
			s.setMarks(marks);
	    	stud[i]=s;
			
		}
		//for each loop
		 for(Students s:stud)//s=stud[0]
		{
			//if(s.name.startsWith("R"))
			System.out.println(s);
		}
			}

		

	}


