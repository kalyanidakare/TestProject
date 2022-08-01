package Abstract;

public abstract class Car {//cannot create object of abstract class

	int price;
	String brand;
	
	void setData(int price,String brand) {
		this.brand=brand;
		this.price=price;
	}
	void noOfSeats()
	{
		System.out.println("Car has 4 seat");
	}
	void wheelno()
	{
		System.out.println("4 wheels");
	}
	void gears()
	{
		System.out.println("5 gears");
	}
	abstract void noofSeats();//override
	abstract void dashboard();
	abstract void engine();
//	abstract void wheelTyre();

}
