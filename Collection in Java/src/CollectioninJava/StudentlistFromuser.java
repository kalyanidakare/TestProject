package CollectioninJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class StudentlistFromuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> a1=new ArrayList<>();
//		a1.add(new Student(101,"Rashmi","Computer",70));
//		a1.add(new Student(102,"Rashi","Computer",65));
//		a1.add(new Student(103,"Ranu","Computer",85));
//		a1.add(new Student(104,"Ramni","Computer",60));
//		a1.add(new Student(105,"Minakshi","Electrical",75));
//		a1.add(new Student(106,"Rashmi","Civil",70));
//		a1.add(new Student(107,"Rashmi","Mechanical",70));
//		a1.add(new Student(108,"Rashmi","Computer",70));
//		a1.add(new Student(109,"Rashmi","Computer",70));
//		a1.add(new Student(110,"Rashmi","Entc",70));
		
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
//Department dept[] = new Department[2];//3
//int r=sc.nextInt();

for(int i=0;i<2;i++)//department
{
	System.out.println("Enter the did,dname of the "+(i+1)+"department:");
	int did=sc.nextInt();
	String dname=sc.next();
    Student stud[]=new Student[2];//5

	for(int j=0;j<2;j++)//student:5
	{
		System.out.println("Enter the id,name,marks,contact of the"+(j+1)+" student:");
		int id=sc.nextInt();
		String name=sc.next();
		int marks=sc.nextInt();
        String contact=sc.next();
	
//	stud[j]=new Student(id,name,marks,contact);
//	}
//	dept[i]=new Department(did,dname,stud);
//}
//	System.out.println(Arrays.toString(dept));
//	for(Department d:dept) {
//		
//		for(Student s:d.stud) {
//			
//		if(s.marks>60) {
//			
//		
//			System.out.println(d.dname+" "+s.name+" "+s.marks);
//	}
//	
}
}

sc.close();

	}

}
