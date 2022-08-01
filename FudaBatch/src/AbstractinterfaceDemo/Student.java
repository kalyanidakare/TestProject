package AbstractinterfaceDemo;

public class Student implements Admission,College {

	public void uniform() 
	{
		System.out.println("College has a uniform");
	}
	public void idCard()
	{
		System.out.println(" Id card taken from college");
	}
	
	public void marksheet10()
	{
		System.out.println("10th marks:yes");
	}

	public void marksheet12() {
		System.out.println("12th marks:yes");

	}

	
	public void nationalty() {
		System.out.println("Nationality: yes");

	}


	public void leavingCertificate() {
		System.out.println("leavingCertificate:yes");

	}

	
	public void incomeCertificate() {
		System.out.println("incomecertificate: yes");

	}
	public void aadharcard() {
		System.out.println("yes");

	}
	public void transport() {
System.out.println("transport by car");		
	}
	@Override
	public void labortary() {
		// TODO Auto-generated method stub
		
	}
		
	
}
