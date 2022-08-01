package AbstractinterfaceDemo;

public class AdmissionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student();
		s1.marksheet10();
		s1.marksheet12();
		s1.nationalty();
		s1.leavingCertificate();
		s1.incomeCertificate();
		s1.aadharcard();
		
		s1.uniform();
		s1.idCard();
		s1.transport();
		s1.library();//for default

		College.labratory();//for static
	}

}
