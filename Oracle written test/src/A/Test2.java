package A;

public class Test2 extends Test1{ //test1 will become parent class//Test 2 child class

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test2 t2=new Test2();
		System.out.println(t2.a);
		//System.out.println(t2.b);//private
		System.out.println(t2.c);
		System.out.println(t2.d);
	}

}
