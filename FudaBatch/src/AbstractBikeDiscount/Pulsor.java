package AbstractBikeDiscount;

public   class Pulsor extends Bike{
	
	int modelno;
	
	void setPulsorData(int modelno) {
		this.modelno=modelno;
		
	}
	void gears() {
		 System.out.println(" No of 4 gears ");

	}
	void feature() {
		 System.out.println(" Selfstart");

	}
	void seatno() {
		 System.out.println("two seat ");

	}
	void discount() 
	{
		double discount;
		int installment =0;

		if(installment==0)
		{
		discount=(price*15)/100;
			 System.out.println(" The immediate half discount will"+discount);

		}
		else if (installment==1){
			discount=(price*10)/100;
    	System.out.println(" The immediate full discount will"+discount);
		}
		else {
			System.out.println("No discount");
		}

	}
	void display()
	{
		System.out.println("modelno");
	}

	}
	
	


