
public class Removealloccuranceword {

	private static String word;

	static void remove(String str, String word) {
//		String Str = "My name name is ";
		String[] strArr = str.split(" ");// split string
		String newstr = " ";

		// interating string
		for (String words : strArr) {
			// If desired word found
			if (!words.equals(newstr)) {
				newstr += words + " "; // the word not equal to given words

			}

		}
		System.out.println(newstr);
	}

//main driver method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			String Str = "My name is ";
			String word = " "; // removed from other string

			remove(Str, word); // call method 1 by passing both string

		}

	}
}
