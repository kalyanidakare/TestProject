package AbstractBikeDiscount;

public abstract class Bike {
 int price;
 String color,brand;
 void setBikeData(int price,String color,String brand) 
 {
		this.price=price;
        this.color=color;
		this.brand=brand;
	}
 void display() {
	 System.out.println(price+" "+color+" "+brand);
 }
  
 void wheelno() {
	 System.out.println(" wheel no 2");
 }
 void mirror() {
	 System.out.println(" mirros 2");
 }

	abstract void feature();
	abstract void seatno();
	abstract void discount();
	
}

