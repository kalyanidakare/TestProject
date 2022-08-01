package ClassesAndObject;

import java.util.Scanner;

public class Employee {
	int id,salary; //local variable
	String name,dept,designation,rating;
	
	void setData(int i,String n,String d,int s,String des,String r)
	{
		id=i;
		name=n; 
		dept=d;
		salary=s;
		designation=des;
		rating=r;

	}
	public String toString() {
	return id+" "+name+" "+dept+" "+salary+" "+designation+" "+rating;	
	}
void bonus()
{
	if(rating.equals("A"))
	{
	salary=salary+salary*15/100;
		System.out.println(" bonus :"+salary);
	}
	else if(rating.equals("B"))
	{
		salary=salary+salary*10/100;
		System.out.println(" bonus :"+salary);
	}
	else if(rating=="c")
	{
		salary=salary+salary*5/100;
		System.out.println(" bonus :"+salary);
		}
	else if(rating=="D")
	{
		System.out.println("no bonus");
	}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int id,salary; //local variable
		String name,dept,designation,rating;
		Scanner sc=new Scanner(System.in);
		
		  Employee e1=new Employee();
           
		System.out.println("enter the id,name,dept,salary,designation,rating");
			id=sc.nextInt();
			name=sc.next();
			dept=sc.next();
			salary=sc.nextInt();
			designation=sc.next();
			rating=sc.next();
			e1.setData(id, name, dept, salary, designation, rating);//101,
			
			Employee e2=new Employee();
            System.out.println("enter the id,name,dept,salary,designation,rating");
            id=sc.nextInt();
            name=sc.next();
			dept=sc.next();
			salary=sc.nextInt();
			designation=sc.next();
			rating=sc.next();
			e2.setData( id, name, dept, salary, designation, rating);//101,
			
			Employee e3=new Employee();
            System.out.println("enter the id,name,dept,salary,designation,rating");
            id=sc.nextInt();
            name=sc.next();
			dept=sc.next();
			salary=sc.nextInt();
			designation=sc.next();
			rating=sc.next();
			e3.setData( id, name, dept, salary, designation, rating);//101,
			
			Employee e4=new Employee();
            System.out.println("enter the id,name,dept,salary,designation,rating");
            id=sc.nextInt();
            name=sc.next();
			dept=sc.next();
			salary=sc.nextInt();
			designation=sc.next();
			rating=sc.next();
			e4.setData( id, name, dept, salary, designation, rating);//101,
			
			Employee e5=new Employee();
            System.out.println("enter the id,name,dept,salary,designation,rating");
            id=sc.nextInt();
            name=sc.next();
			dept=sc.next();
			salary=sc.nextInt();
			designation=sc.next();
			rating=sc.next();
			e5.setData( id, name, dept, salary, designation, rating);//101,
			
		
			System.out.println(e1);
			e1.bonus();

			System.out.println(e2);
			e2.bonus();

			System.out.println(e3);
			e3.bonus();
			
			System.out.println(e4);
			e4.bonus();
			

			System.out.println(e5);
			e5.bonus();

		
		
	  
	}
		
	}


	
	
