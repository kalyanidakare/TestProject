package Day1;

import java.util.Scanner;

public class TotalAvgPer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 

		float Eng,Math,Bio,Chem,Comp;
		double total,avg,per;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter marks of five subjects:");
		System.out.println("Enter marks of English subjects:");
		Eng=s.nextFloat();
		System.out.println("Enter marks of Math sujects:");
		Math=s.nextFloat();
		System.out.println("Enter marks of Bio sujects:");
		Bio=s.nextFloat();
		System.out.println("Enter marks of Chem sujects:");
		Chem=s.nextFloat();
		System.out.println("Enter marks of Comp sujects:");
		Comp=s.nextFloat();
		//calculate
		total=Eng+Math+Bio+Chem+Comp;
		avg=(total/5.0);
		per=(total/500.0)*100;//(obtained/total)*100
		
	System.out.println("Total marks="+total);
	System.out.println("Average marks="+avg);
	System.out.println("Percentage="+per);


		

	}

}

