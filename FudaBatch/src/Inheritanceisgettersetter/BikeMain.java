package Inheritanceisgettersetter;

import java.util.Scanner;

public class BikeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		return name+" " + brand+" " + modelno+" "+milage+" "+weight+" "+price+" "+color;

		System.out.println("Enter name,brand,modelno,milage,weight,price,color");
		System.out.println();
		String name = sc.next();
		String brand = sc.next();
		String modelno = sc.next();
		String milage = sc.next();
        int weight=sc.nextInt();
		int price = sc.nextInt();
         String color = sc.next();
        
		Pulsor p1 = new Pulsor();
		p1.setName(name);
		p1.setBrand(brand);
		p1.setModelno(modelno);
		p1.setMilage(milage);
		p1.setWeight(weight);
		p1.setPrice(price);
		p1.setColor(color);

		System.out.println(p1);     
//		p1.gears();
//		p1.wheelno();
//		p1.engine();

	}

}
 