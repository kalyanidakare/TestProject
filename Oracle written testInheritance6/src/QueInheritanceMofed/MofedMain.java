package QueInheritanceMofed;

import java.util.Scanner;


public class MofedMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
 
		Activa a=new Activa();
		System.out.println(" Enter: price,color,milage,brand,avg,weight");
 int price=sc.nextInt();
 String color=sc.next();
 String milage=sc.next();
 String brand=sc.next();
 int avg=sc.nextInt();
 int weight=sc.nextInt();
 
  a.setPrice(price);
  a.setColor(color);
  a.setMilage(milage);
  a.setBrand(brand);
  a.setAvg(avg);
  a.setWeight(weight);
  
  System.out.println(a);
  a.Showroom();
		
	}

}
