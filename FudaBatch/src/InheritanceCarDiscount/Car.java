package InheritanceCarDiscount;

public class Car {

	 int price,launchyear;
	 String name,brand;
		void setCarData(String name, String brand, int price, int launchyear) {
			this.name =name;
			this.brand = brand;
            this.price = price;
			this.launchyear = launchyear;

		}
		void display()
		{
			System.out.println(name+" "+brand+" "+launchyear+" "+price);
		}

}

