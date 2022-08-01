package ClassesAndObject;

public class Student {
	
	void javaCource()
	{
		System.out.println("J2SE+J2EE");
	}
	void pythonCource()
	{
		System.out.println("python+database");
	}
	
	void frontEndCource()
	{
		System.out.println("HTML+CSS");
	}
	void instituteName()
	{
		System.out.println("ThinkQuotient");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		
		s1.javaCource();
		s2.pythonCource();
		s3.frontEndCource();
		
	}

}
