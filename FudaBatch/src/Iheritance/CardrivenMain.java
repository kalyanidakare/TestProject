package Iheritance;

public class CardrivenMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Drivercontaintment d1=new Drivercontaintment(1001,"Sachuu","1432456");
		Drivercontaintment d2=new Drivercontaintment(1003,"Sacchhii","1234567");
		
		Car c1=new Car(1,"Bulero","Maruti",d1);
		Car c2=new Car(2,"Swift Desire","Maruti1",d2); 
		
		//composition
//		Car c1=new Car(1,"Bulero","Maruti",1001,"Sachin","9876543210");
//		Car c2=new Car(2,"Swift Desire","Maruti1",1003,"Ramesh","85463278"); 
//		
		System.out.println(c1);
		System.out.println(c2);

		
	}

}

