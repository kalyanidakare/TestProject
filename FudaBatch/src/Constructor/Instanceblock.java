package Constructor;

public class Instanceblock {
	int id,marks; //local variable
	String name,dept,sports;
	static String colgname;
	{
	

		id=00;
		marks=00;
		name="name";
		dept="name";
		dept="dept";
		sports = "sports";
       colgname="DYPCODE";
       System.out.println("In instance block");
	}
	{
		System.out.println("Instance block2");
	}
Instanceblock()
{
	System.out.println("In default constructor");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
