package AbstractBikeDiscount;

public class Activa extends Bike {
	int modelno, installment;
	String engine;

	void setActivaData(int modelno, String engine) {
		this.modelno = modelno;
		this.engine = engine;
//		this.installment=installment;
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

	void discount() {
		// TODO Auto-generated method stub
		double discount;

		if (installment == 0) {
			discount = (price * 15) / 100;
			System.out.println(" The immediate half discount will" + discount);

		} else if (installment == 1) {
			discount = (price * 10) / 100;
			System.out.println(" The immediate full discount will" + discount);
		} else {
			System.out.println("No discount");
		}

	}

	void display() {
		super.display();
		System.out.println("modelno");
	}

}
