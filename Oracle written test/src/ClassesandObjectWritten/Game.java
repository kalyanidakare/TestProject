package ClassesandObjectWritten;

import java.util.Scanner;

public class Game {
        String Country;
        void setData(String Cn)
        {
        	Country=Cn;
        }
        public String toString()
        {
        	return Country;
        }
        void game()
        {
        	switch (Country)
        	{
        		case "India":
        			System.out.println("National game is Hockey");
        		break;
        		case "China":
        			System.out.println("National game is table tennis");
        			break;
        		case "Bangladesh":
        		System.out.println("National game is Kabbadi:");
        			break;
        		case "Italy":
        			System.out.println("National game is football:");
        			break;
        		case "US":
        			System.out.println("National game is baseball");
        			break;
        			default:
        			System.out.println("Ivalid Country");
        	}
        }
        
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String Country;
     Scanner sc=new Scanner(System.in);
     
     Game g1=new Game();
     System.out.println("Enter country name");
     Country=sc.next();
     g1.setData(Country);
     g1.game();
     
     Game g2=new Game();
     System.out.println("Enter Country name");
     Country=sc.next();
     g2.setData(Country);
     g2.game();
     
     Game g3=new Game();
     System.out.println("Enter Country name");
     Country=sc.next();
     g3.setData(Country);
     g3.game();
     
     
     Game g4=new Game();
     System.out.println("Enter Country name");
     Country=sc.next();
     g4.setData(Country);
     g4.game();
     
     Game g5=new Game();
     System.out.println("Enter Country name");
     Country=sc.next();
     g5.setData(Country);
     g5.game();
    
    
    
     
     
	}

}
