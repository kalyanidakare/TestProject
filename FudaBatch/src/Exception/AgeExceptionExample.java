package Exception;

public class AgeExceptionExample {

	void validate(int age) throws AgeException {

		if (age < 18) 
		{
			throw new AgeException("age is less,not for allowed for rollerCoster Ride");
		} else if (age > 60) 
		{
			throw new AgeException("age is greater,not allowed for rollerCoster Ride");
		}

		else {
			System.out.println("Enjoy your ride");
		}
	}

	public static void main(String[] args) throws AgeException{
		// TODO Auto-generated method stub
int age=65;
AgeExceptionExample aee=new AgeExceptionExample();

try {
aee.validate(age);
}
catch (AgeException e) {
	e.printStackTrace();
}

System.out.println("Done");


	}

}
