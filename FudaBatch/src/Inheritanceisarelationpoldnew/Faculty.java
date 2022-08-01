package Inheritanceisarelationpoldnew;

public class Faculty extends Person{

	int id,salary;
	String subject;
	char performance;
	void setFacultyData(int id,int salary,String subject,char performance)
	{
		this.id=id;
		this.subject=subject;
		this.performance=performance;
		
	}
	void bonus()
	{
		if(performance=='A')
		{float bonus=(salary*20)/100;
		float newSalary=salary+bonus;
		System.out.println("new Salary:"+newSalary);
		}
		else if(performance=='B')
		{
			float bonus=(salary*15)/100;
			float newSalary=salary+bonus;
			System.out.println("new Salary:"+newSalary);
		}
		else if(performance=='c') {
			float bonus=(salary*10)/100;
			float newSalary=salary+bonus;
			System.out.println("new Salary:"+newSalary);
			}
		else if(performance=='D') {
			float bonus=(salary*5)/100;
			float newSalary=salary+bonus;
			System.out.println(" very less performance...");
		}
		else 
			System.out.println("very less performace.....");
	}
	public String toString() {
		return id+" "+name+" "+subject+" "+performance+" "+salary;
	}
}
