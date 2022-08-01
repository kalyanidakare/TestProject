import java.util.Scanner;

public class UserdefinedExceptionExample {

	void UserdefinedException4(int b,int c)throws UserdefinedException4
	{
		if(b==c) {
			throw new UserdefinedException4(" b is equal c");
		}
		else if(b<c)
		{
			throw new UserdefinedException4("b is less than c");
		}
		else
			System.out.println("b is greater than c");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two number");
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		UserdefinedExceptionExample u=new UserdefinedExceptionExample();
		try {
			u.UserdefinedException4(b,c);
			
		}catch(UserdefinedException4 e) {
			e.printStackTrace();
		}
		System.out.println("done");
		sc.close();
	}

}
