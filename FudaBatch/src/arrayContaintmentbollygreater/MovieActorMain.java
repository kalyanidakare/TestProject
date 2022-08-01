package arrayContaintmentbollygreater;

import java.util.Arrays;
import java.util.Scanner;

public class MovieActorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Movie mov[] = new Movie[1];

		for (int i = 0; i < 1; i++) {
			System.out.println("Enter id,name,boxofficecollection,actor list of the Movie");
			int id = sc.nextInt();
			String name = sc.next();
			int Boxofficecollection = sc.nextInt();

//    		return id+" "+ename+" "+dept+" "+salary+" "+contact+" "+address;

			Actor ac[] = new Actor[2];
			for (int j = 0; j < 2; j++) {
				System.out.println("Enter id,birthyear,name,address");
//				return id+" "+birthyear+" "+name+" "+address;
				int aid = sc.nextInt();
				int birthyear = sc.nextInt();
				String aname = sc.next();
				String address = sc.next();

				Actor a1 = new Actor();
				a1.setAId(aid);
				a1.setBirthyear(birthyear);
				a1.setAName(aname);
				a1.setAddress(address);

				ac[j] = a1;

			}
			Movie m1 = new Movie();
			m1.setId(id);
			m1.setName(name);
			m1.setAc(ac);
			m1.setBoxofficecollection(Boxofficecollection);
			mov[i] = m1;
		}

		System.out.println(Arrays.toString(mov));
		for (Movie m : mov) {
			for (Actor a : m.ac) {

				if (a.getAName().equals("Salmankhan") && m.getBoxofficecollection() > 5000000) {

					System.out.println(m.name + " " + a.aid + " " + a.birthyear + " " + a.aname + " " + a.address);

				}

			}
		}
	}
}
