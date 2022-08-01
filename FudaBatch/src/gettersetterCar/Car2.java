package gettersetterCar;

public class Car2 {
	 int id,price,installment,discount;
	 String name,year,brandname,payment;
	 
	 int getId()
	 {
		 return id;
	 }
	 void setId(int id)
	 {
		 this.id=id;
	 }
	 int getPrice()
	 {
	 return price*price; 
	 }
	 void setPrice(int price)
	 {
		 this.price=price;
	 }
	 int getInstallment()
	 {
		 return installment;
	 }
	 void setInstallment(int installment)
	 {
		 this.installment=installment;
	 }
	 int getDiscount()
	 {
		 return discount;
	 }
	 void setDiscount(int discount)
	 {
		 this.discount=discount;
	 }
	 String getName()
	 {
		 return name;
	 }
	 void setNmae(String nmae)
	 {
		 this.name=name;
	 }
	 String getYear()
	 {
		 return year;
      }
	 void setYear(String year)
	 {
		 this.year=year;
	 }
	 
	 String getBrandname()
	 {
		 return brandname;
	 }
	 void setBrandname(String brandname)
	 {
		 this.brandname=brandname;
		 
	 }
	 String getPayment()
	 {
		 return payment;
	 }
	 void setPaymente(String payment)
	 {
		 this.payment=payment;
		 
	 }
public String toString()
{
	return id+" "+price+" "+name+" "+year+" "+brandname;
}
	
	}


