package Queperson;

import java.util.Arrays;
import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Person p[] = new Person[2];
          for (int i = 0; i < 2; i++)
          {
			System.out.println("Enter:pid,name,contact,address of person");
			int pid = sc.nextInt();
			String pname = sc.next();
			String contact = sc.next();
			String address = sc.next();
			
			 Idproof idp[] = new Idproof[2];

				for (int j = 0; j < 2; j++)
				{
					System.out.println("Enter name,number,validity of Idproof");
					String name = sc.next();
					String number = sc.next();
					int validity = sc.nextInt();

					Idproof i1 = new Idproof();
					i1.setName(name);
					i1.setNumber(number);
					i1.setValidity(validity);

					idp[j] = i1;
					
				}
			
			Person p1 = new Person();
			p1.setPid(pid);
			p1.setPName(pname);
			p1.setContact(contact);
			p1.setAddress(address);
			p1.setIdp(idp);
			p[i] = p1;
		}			
			System.out.println(Arrays.toString(p));
			for (Person s : p) {
				for (Idproof ip : s.idp) {

					if (ip.getName().equals("AdharCard") && s.getAddress().equals("Pune") )
					{

						System.out.println(s.pid+" "+s.pname + " " + s.contact + " " + s.address+" "+ip.name+" "+ip.number+" "+ip.validity);

					}

			
			}
			}
			}
	}

