package Constructor;

public class Parametrised {
	int id,marks;//default values 0,null,0.0
	String name;
	//paramerised method
	Parametrised()
	{
		id=1;
		marks=-1;
		name="000";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();//constructor
		System.out.println(s1);
		int id=101;
	}

}
