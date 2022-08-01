package Exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class ExceptionParentChildjava {

	class AB
	{
		void display()throws IOException
		{
			System.out.println("in parent class");

	}
}

 class BC extends AB
{
	//void display()throws SQLException//remove excepton because its not part of parent exception
	//void display()throws IOException//it accept exception throw
	void display()throws FileNotFoundException//it accept exception throw
	
	{
		System.out.println("In child class");
	}
}
	public class ExceptionParentChild{
		
	
	public void main(String[] args) {
		// TODO Auto-generated method stub

	}

	}}
