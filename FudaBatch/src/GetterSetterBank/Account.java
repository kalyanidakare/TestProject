package GetterSetterBank;

import java.util.Scanner;

public class Account {
	
	int accno,balance,contacts;
	String name;
	Scanner sc=new Scanner(System.in);
	Account a1=new Account();
//	System.out.println("enter the id,name,accno a":);



int getBalance()
{
	return balance;
}
void setBalance(int balance)
{
	this.balance=balance;
}
void setAccno(int accno)
{
	this.accno=accno;
}
int getAccno()
{
	return accno;
}
void setName(String name)
{
	this.name=name;
}
String getNmae()
{
	return name;
}
void setContacts1(int contacts)
{
	this.contacts=contacts;
}
int getCotact()
{
	return contacts;
}



//void setData(int accno,)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
