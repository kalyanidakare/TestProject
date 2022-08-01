
public class Ecryptionsplitstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "the sky is the limit";
		String str[] = s1.split(" ");

//		for (String s : str) {
//        	System.out.println(s);
//		}
////        System.out.println(" total no of words:" + str.length);
		char ch[] = s1.toCharArray();
		String s = "";

		for (int i = 0; i < str.length; i++) {
			int add=0;
			for(int j=0;j<str[i].length();j++)
			{
				add=add+((str[i].charAt(j))-64);
			}
			System.out.println(str[i]+" "+add);
			
}
}}