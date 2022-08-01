//import java.util.Scanner;

public class Returnintvalueinfinally3 {
	@SuppressWarnings("finally")

		public int ReturnMethod() {
			try {
	           throw new Exception();
			}
//			catch(Exception e) {
//				e.printStackTrace();
//			}
			finally {
				System.out.println("I am in finally block");
				return 10;
			}
		
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
//class f=new class();
//FinallyReturn1();//return int value by call method 
//System.out.println(obj.m1());

			Returnintvalueinfinally3 returnintvalue = new Returnintvalueinfinally3 ();
			int returnvalue=returnintvalue.ReturnMethod();//call by method &return int value
			System.out.println("The return value:"+returnvalue);
			

}
}