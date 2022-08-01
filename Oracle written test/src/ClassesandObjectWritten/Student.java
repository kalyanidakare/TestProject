package ClassesandObjectWritten;

import java.util.Scanner;

public class Student {
	private static final String S1 = null;

	int id,m1,m2,m3,percentage,marks;
    
	String name,dept;
	
	void setData(int i,String n,int p,int q,int r,String d)
	{
		id=i;
		name=n;
		m1=p;
		m2=q;
		m3=r;
		dept=d;
	}
	public String toString()
	{
		return id+" "+name+" "+m1+" "+m2+" "+m3+" "+dept;
		
	}
	void marks()
	{
		marks=m1+m2+m3;
		System.out.println("Total marks"+marks);
	}
	void percentage()
	{
		percentage=(marks*100)/300;
		System.out.println(percentage);
	}
	void result()
	{
		if(percentage>=75)
		{
		System.out.println("you got distinction");	
		}
		else if(percentage>=60)
		{
			System.out.println("you got 1st class");
		}
		else if(percentage>=50)
		{
			System.out.println("you got 2nd class");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int id,m1,m2,m3,percentage,marks;
String name,dept;
Scanner sc=new Scanner(System.in);
	Student s1=new Student();
	System.out.println("Enter:id,name,m1,m2,m3,dept");
	id=sc.nextInt();
	name=sc.next();
	m1=sc.nextInt();
	m2=sc.nextInt();
	m3=sc.nextInt();
	dept=sc.next();
	s1.setData(id,name,m1,m2,m3,dept);
	System.out.println(s1);	
		s1.marks();
		s1.percentage();
		s1.result();
	Student s2=new Student();
	System.out.println("Enter:Id,name,m1,m2,m3,dept");
	
	id=sc.nextInt();
	name=sc.next();
	m1=sc.nextInt();
	m2=sc.nextInt();
	m3=sc.nextInt();
	dept=sc.next();
	s2.setData(id, name, m1, m2, m3, dept);
	System.out.println(s2);
	s2.marks();
	s2.percentage();
	s2.result();
	
	Student s3=new Student();
	System.out.println("Enter:id,name,m1,m2,m3,dept");
	id=sc.nextInt();
	name=sc.next();
	m1=sc.nextInt();
	m2=sc.nextInt();
	m3=sc.nextInt();
	dept=sc.next();
    s3.setData(id,name,m1,m2,m3,dept);
	System.out.println(s3);
	s3.marks();
	s3.percentage();
	s3.result();
	
	
	}

}
