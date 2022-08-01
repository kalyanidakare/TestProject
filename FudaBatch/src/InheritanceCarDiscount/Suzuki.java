package InheritanceCarDiscount;

public class Suzuki extends Car {
	int id,modelno,installment;
	 String modeofpayment;
	 
	 void setSuzukiData(int id,int modelno,int installment,String modeofpayment) 
	
	 {
		 this.id=id;
		 this.modelno=modelno;
		 this.installment=installment;
		 this.modeofpayment=modeofpayment;
	 }
	 void display()
		{
			System.out.println(id+" "+modelno+" "+installment+" "+modeofpayment);
		}

	 void discount() {
	 double discount;
	 
	 if (installment==0 && modeofpayment.equals("cash"))
				{
		discount=price*15/100;
		System.out.println("The discount is"+discount);
				}
	    else if(installment==0 && modeofpayment.equals("Online"))
	    
	    		{
					discount=price*15/100;
					System.out.println("The discount is"+discount);
					}
	    
		else if(installment==1 &&  modeofpayment.equals("Cash") ) {
			discount=price*25/100;
			System.out.println("The discount is"+discount);
			
		}
		else if(installment==1 &&  modeofpayment.equals("Online") ) {
			discount=price*20/100;
			System.out.println("The discount is"+discount);
			
		}else if(installment==2 && modeofpayment.equals("Cash") ) {
			discount=price*10/100;
			System.out.println("The discount is"+discount);
			
		}else {
			System.out.println("No discount");
		}
		

		

}
}