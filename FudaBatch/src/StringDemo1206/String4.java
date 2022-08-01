package StringDemo1206;

public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer s = new StringBuffer("Welcome"); // defining a string using stringbuffer
		int p = s.length();
		int q = s.capacity();
		System.out.println("Length of string=" + p);
		System.out.println("Capacity of string=" + q);

		// create a StringBuilder object using StringBuilder() constructor
		StringBuilder str = new StringBuilder();

		str.append("Thinkquotient");

		// print string
		System.out.println("String = " + str.toString());

		// create a StringBuilder object using StringBuilder(CharSequence) constructor
		StringBuilder str1 = new StringBuilder("Online");

		// print string
		System.out.println("String1 = " + str1.toString());

	}

	}

