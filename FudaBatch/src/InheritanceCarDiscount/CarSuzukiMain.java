package InheritanceCarDiscount;

import java.util.Scanner;

public class CarSuzukiMain {
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter:name,brand,price,launchyear ");

String name =sc.next();
String brand = sc.next();
int price = sc.nextInt();
int launchyear =sc.nextInt();

Suzuki s1=new Suzuki();
s1.setCarData(name, brand, price, launchyear);

System.out.println("Enter:id,int modelno,int installment,String modeofpayment");
//void setSuzukiData(int id,int modelno,int installment,String modeofpayment) 
int id=sc.nextInt();
int modelno=sc.nextInt();
int installment=sc.nextInt();
String modeofpayment=sc.next();

s1.setSuzukiData(id,modelno, installment, modeofpayment);
s1.discount();
s1.display();


	}

	
}
