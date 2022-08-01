package Day3;

import java.util.Scanner;

public class ZodiacSign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter date,month,year");
int date=sc.nextInt();
int month=sc.nextInt();
int year=sc.nextInt();
int febdays;
if(year%4==0)
	febdays=29;
else
	febdays=28;
if(month==1)
{
	if(date<=19)
		System.out.println("Your Zodiac sign is Capricon");
	else if(date>=20 && date<=31)
		System.out.println("Your Zodiac sign is Aquarius");
	else
		System.out.println("Invalid date");
}
if(month==2)
{
	if(date<=19)
		System.out.println("Your Zodiac sign is piseces");
	else if(date>=21 && date<=febdays)
		System.out.println("Your Zodiac sign is Capricon");
	else
		System.out.println("Invalid date");
}
if(month==3)
{
	if(date<=19)
		System.out.println("Your Zodiac sign is Aries");
	else if(date>=21 && date<=30)
		System.out.println("Your Zodiac sign is Capricon");
	else
		System.out.println("Invalid date");
}

if(month==4)
{
	if(date<=19)
		System.out.println("Your Zodiac sign is Taurus");
	else if(date>=21 && date<=31)
		System.out.println("Your Zodiac sign is Capricon");
	else
		System.out.println("Invalid date");
}

if(month==6)
{
	if(date<=19)
		System.out.println("Your Zodiac sign is Aquarios");
	else if(date>=21 && date<=30)
		System.out.println("Your Zodiac sign is Capricon");
	else
		System.out.println("Invalid date");
}
if(month==7)
{
	if(date<=20)
		System.out.println("Your Zodiac sign is Aquarios");
	else if(date>=21 && date<=30)
		System.out.println("Your Zodiac sign is Capricon");
	else
		System.out.println("Invalid date");
}
if(month==8)
{
	if(date<=20)
		System.out.println("Your Zodiac sign is Aquarios");
	else if(date>=21 && date<=30)
		System.out.println("Your Zodiac sign is Capricon");
	else
		System.out.println("Invalid date");
}
if(month==9)
{
	if(date<=20)
		System.out.println("Your Zodiac sign is Aquarios");
	else if(date>=21 && date<=30)
		System.out.println("Your Zodiac sign is Capricon");
	else
		System.out.println("Invalid date");
}
if(month==10)
{
	if(date<=20)
		System.out.println("Your Zodiac sign is Aquarios");
	else if(date>=21 && date<=30)
		System.out.println("Your Zodiac sign is Capricon");
	else
		System.out.println("Invalid date");
}


	}

}
