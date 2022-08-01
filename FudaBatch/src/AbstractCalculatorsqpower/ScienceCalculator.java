package AbstractCalculatorsqpower;

public class ScienceCalculator implements Calculator{

	
	
	public void add() {
		int a=10,b=20;//local variables
		System.out.println("Addition is:"+(a+b));

	}

	
	public void substract() {
		int a=20,b=10;
		System.out.println("Subtraction is:"+(a-b));
	}

	
	public void Multiplication() {
		int a=10,b=15;
		System.out.println("Multiplication is:"+(a*b));
	}

	
	public void Division() {
		int a=20,b=5;
		System.out.println("Division is:"+(a/b));

	}
	void power() {
		int a=5,b=6;
				System.out.println(Math.pow(a, b));
	}

	void square() {
		int a=4;
				System.out.println(Math.sqrt(a));
	}


}
