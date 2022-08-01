package AbstractinterfaceDemo;

public class ClassInterfaceMain {

	class A{
		public void display() {
			System.out.println("In Parent Display Method");
		}
	}
	interface ABC
	{
		void show();
		void display();
	}
//	public class ClassInterfaceMain extends A implements ABC{
	
	public void display() 
	{
		System.out.println("In child Display method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassInterfaceMain c1=new ClassInterfaceMain();
		c1.display();
	}

	}
//}
