package Abstractinterfaceextendby3;

public interface Flower {

	void color();
	void fragrance();
	void petals();
	default void quality() {
		System.out.println("Quality is best");
	}
	
	static void freshness()
	{
		System.out.println("freshness is osaam");
	}
	
}
