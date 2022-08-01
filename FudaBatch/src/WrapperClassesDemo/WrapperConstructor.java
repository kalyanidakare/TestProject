package WrapperClassesDemo;

public class WrapperConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer i1=new Integer(20);
		Integer i2=new Integer("20");
		
		Character c1=new Character('s');
		
		Float f1=new Float(3.5f);
		Float f2=new Float(3.5);	
		Float f3=new Float("3.5");
		
		//valueOf....wrap primitive data type or wrapper classes public static
		//3 overloaded methods for byte,short,int long
		
		Integer it1=Integer.valueOf(30);
		Integer it2=Integer.valueOf(30);
		Integer it3=Integer.valueOf("1171",8);   //3*4^2+2*4^1+1*4^0=48+8+1=53
		                                        //3*8^2+2*8^1+1*8^0=576+16+1=
		
		System.out.println(it3);
		
		int i=Integer.parseInt("30");
		float f=Float.parseFloat("30.5");
		System.out.println(i);
		System.out.println(f);



	}

}
