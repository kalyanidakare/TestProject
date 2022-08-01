package Encapsulation;

public class Bank1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer c1=new Customer();
		c1.setAccno(12456);
		c1.setName("Kalyani");
		c1.setBalance(50000);
		c1.setAdd("Nagpur");
		c1.setContact("9130667661");
		
		c1.setBalance(25000);
		System.out.println(c1.getName()+" "+c1.getAccno()+" "+c1.getBalance()+" "+c1.getContact()+" "+c1.getAdd());
		
	}

}
