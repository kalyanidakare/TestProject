package Inheritanceisarelation;

public class PulsorRs extends Pulsor {

 String engine;
 int speed;
 
 void setPulsorRsData(String engine,int speed)
 {
	 this.engine=engine;
	 this.speed=speed;
	 
		}
public String toString()
{
	return name+" "+brand+" "+modelno+" "+milage+" "+weight+"kg"+price+" "+color+" "+speed+" "+engine;
}
 void gears()//override method
{
	
	System.out.println("Pulsor Rs has 6 gears");
}
}
