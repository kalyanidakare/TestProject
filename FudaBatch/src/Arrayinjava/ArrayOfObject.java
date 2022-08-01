package Arrayinjava;

import java.util.Scanner;

public class ArrayOfObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
Student stud[]=new Student[3];

for(int i=0;i<3;i++)
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
	
	stud[i]=new Student(id,name,dept,marks);
	
}
//for each loop
 for(Student s:stud)//s=stud[0]
{
	//if(s.name.startsWith("R"))
	System.out.println(s);
}
	}

}
