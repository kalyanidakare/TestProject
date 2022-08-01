package Constructor;

import java.util.Scanner;

public class Theater {
  
	String name, m1, m2,m3,m4,addr,contact;
	
	
		
		public	void setname(String name) {
				this.name =name;
		}

		public String getName() {
				return name;

		}
			public void SetM1(String m1) {
				this.m1=m1;
			}
			
			public String getM1() {
				return m1;
			}
			public void setM2(String m2) {
				this.m2=m2;
			}
			
			public  String getM2() {
				return m2;
			}
			public void setM3( String m3) {
				this.m3=m3;
			}
			
			public String getM3() 
			{
				return m3;
			}
			public void setM4(String m4) {
				this.m4=m4;
			}
			
			public String getM4() {
				return m4;
			}
			 public void setAddr(String addr) {
				this.addr=addr;
			}
			
			public String getAddr() {
				return addr;
			}
			public void setContact(String scontact) {
				this.contact=contact;
			}
			
			void movieDetail(String movie)
			{
				if (movie.equalsIgnoreCase(m1))
				{
					System.out.println("ticket Price:150,200,250");
					System.out.println("Shows:9am,12pm,3p,6pm,9pm");
					
				}
				else if(movie.equals(m2))
				{
					System.out.println("ticket Price:150,200,250");
					System.out.println("Shows:9am,12pm,3p,6pm,9pm");
					
				}
				else {
					System.out.println("no such movie");
				}
						
		}
public static void main(String[]args) {
	Theater t1=new Theater();
	t1.SetM1("RRR");
	t1.setM2("Pet Puran");
	t1.setM3("Ranjna");
	t1.setM4("Rk");
	t1.setname("Rakshak");
	t1.setAddr("KGF");
	t1.setContact("18235455");
Scanner sc=new Scanner(System.in);
System.out.println("Movies:"+t1.getM1()+"/"+t1.getM2()+"/"+t1.getM3()+"/"+t1.getM4());
System.out.println("Enter the movie name:");
String movie=sc.next();

t1.movieDetail(movie);
}


}