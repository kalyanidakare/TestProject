package AbstractinterfaceDemo;

public interface College {

	void uniform();
	void idCard();
	void transport();
	default void library() {
		System.out.println("membarship is mandatory");
	}
	
	static void labratory()
	{
		System.out.println("labs are compalsary for all");
	}
//	java 1.9
//	private void accounts() {
//		System.out.println("Confidential information");
//	}
//	
}
