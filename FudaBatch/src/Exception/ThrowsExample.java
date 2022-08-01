package Exception;

public class ThrowsExample {
	
	int getStringLength(String s) 
	{
		if(s==null)
		{
			throw new NullPointerException("String is null");
		}
		return s.length();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThrowsExample t1=new ThrowsExample();
	System.out.println(t1.getStringLength("India"));
	try
	{
		System.out.println(t1.getStringLength(null));
	}
	catch(NullPointerException e)
	{
		throw new NullPointerException("null String....Please enter valid");
	}
	System.out.println(t1.getStringLength("India"));
	System.out.println(t1.getStringLength(null));
	System.out.println(t1.getStringLength("Mumbai"));
	System.out.println(t1.getStringLength("Program"));
	
	}

}
