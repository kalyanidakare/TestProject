package Inheritancelaptop;

import java.util.Scanner;

public class LaptopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter:noOfUSBPort,processorSpeed");
		int noOfUSBPort=sc.nextInt();
		int processorSpeed=sc.nextInt();
		
		Laptop l1=new Laptop();
		l1.setNoOfUSBPort(noOfUSBPort);
		l1.setProcessorSpeed(processorSpeed);
		
		System.out.println(l1.getNoOfUSBPort());
		System.out.println(l1.getProcessorSpeed());
	}

}
