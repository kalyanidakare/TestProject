package CompanyhasCar;

import java.util.Scanner;


public class CompanyCar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	
	int id,price;
	 String name,model;
	 int cid,cyear;
	 String cname;
	 Car c;
		Car c1 = new Car();

	System.out.println("Enter id,name,model,price");
	id=sc.nextInt();
	name=sc.next();
	model=sc.next();
	price=sc.nextInt();
	c1.setId(id);
    c1.setName(name);
    c1.setModel(model);
    c1.setPrice(price);
    
	Company com1=new Company();
    System.out.println("Enter company cid,cname,cyear");
     cid=sc.nextInt();
     cname = sc.next();
	 cyear=sc.nextInt();
	com1.setCid(cid);
	com1.setCname(cname);
	com1.setCYear(cyear);
	com1.setC(c1);
	System.out.print(com1);

	Company com2=new Company();
	 System.out.println("Enter company cid,cname,cyear");
     cid=sc.nextInt();
     cname = sc.next();
	 cyear=sc.nextInt();
	com2.setCid(cid);
	com2.setCname(cname);
	com2.setCYear(cyear);
	com2.setC(c1);
	System.out.println(com2);

	Company com3=new Company();
	 System.out.println("Enter company cid,cname,cyear");
     cid=sc.nextInt();
     cname = sc.next();
	 cyear=sc.nextInt();
	com3.setCid(cid);
	com3.setCname(cname);
	com3.setCYear(cyear);
	com3.setC(c1);
  System.out.println(com3);


	Company com4=new Company();
	 System.out.println("Enter company cid,cname,cyear");
     cid=sc.nextInt();
     cname = sc.next();
	 cyear=sc.nextInt();
	com4.setCid(cid);
	com4.setCname(cname);
	com4.setCYear(cyear);
	com4.setC(c1);
  System.out.println(com4);

	Company com5=new Company();
	 System.out.println("Enter company cid,cname,cyear");
     cid=sc.nextInt();
     cname = sc.next();
	 cyear=sc.nextInt();
	com5.setCid(cid);
	com5.setCname(cname);
	com5.setCYear(cyear);
	com5.setC(c1);
System.out.println(com5);


	}

}
