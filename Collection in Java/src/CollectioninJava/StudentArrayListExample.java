package CollectioninJava;

import java.util.ArrayList;

public class StudentArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> a1=new ArrayList<>();
		
		a1.add(new Student(101,"Rashmi","Computer",70));
		a1.add(new Student(102,"Rashi","Computer",65));
		a1.add(new Student(103,"Ranu","Computer",85));
		a1.add(new Student(104,"Ramni","Computer",60));
		a1.add(new Student(105,"Minakshi","Electrical",75));
		a1.add(new Student(106,"Rashmi","Civil",70));
		a1.add(new Student(107,"Rashmi","Mechanical",70));
		a1.add(new Student(108,"Rashmi","Computer",70));
		a1.add(new Student(109,"Rashmi","Computer",70));
		a1.add(new Student(110,"Rashmi","Entc",70));
		
		for(Student s: a1)
		{
			if(s.dept.equalsIgnoreCase("Computer")&& s.marks>60)
				System.out.println(s);
//			{
//				if(s.name.startsWith("R"))
//					System.out.println(s);
//			}
		
			
		}
		
		
	}

}
