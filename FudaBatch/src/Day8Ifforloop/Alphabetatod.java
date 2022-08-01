package Day8Ifforloop;
import java.util.Scanner;
public class Alphabetatod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//aaa
		//bbb
		//ccc
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int r;//3
		char ch = 'a';
        r=sc.nextInt();
                for(int i=1;i<=r;i++)
		{
				for(int j=1;j<=r;j++)
				{
					System.out.print(" "+ch );
					}

   			System.out.println();
   			ch++;
				}
		     
		          System.out.println("Done");

	}

}
