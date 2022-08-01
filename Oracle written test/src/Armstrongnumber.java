import java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,temp,ch=0,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
        num=sc.nextInt();
         temp=num;
         
         int cnt = 0;
		while(temp!=0)//153
         {
        	 cnt++; //cnt=1
        	 temp=temp/10;
        	 
		}
         temp=num;
         
         while(temp!=0)
         {
        	 int r=temp%10;
        	 int pow=1;
        	 for (int i=1;i<=cnt;i++)
        	 {
        		 pow=pow*r;
       
        	 }
        	 temp=temp/10;
        	 sum=sum+pow;
        	 }
         if(sum==num)
        	 System.out.println("Armstrong number");
         else
        	 System.out.println("Not armstrong");
	}}

	


