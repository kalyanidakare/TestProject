package GetterSetterBank;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance,accno,amt = 0;
		String contacts;
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter accno,name,balance,contacts");
		accno=sc.nextInt();
		name=sc.next();
		balance=sc.nextInt();
		contacts=sc.next();
		
Account a1=new Account();
a1.setAccno(1245);
a1.setName("");
a1.setBalance(50000);
a1.setContacts1(19356488);

Bank b1=new Bank();
b1.gpay(amt,a1);
	}

}
