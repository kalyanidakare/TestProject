package StringDemo1206;

//count occurance of a char in string
public class occurancetocheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Java is a programming languages";

		char ch[] = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {
			int cnt = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (ch[i] == ch[j]) {

					cnt++;
					
 //	  ch[j]='a';
				}

			}

//	if(ch[i]!='a') 

			System.out.println(ch[i] + " " + cnt);

		}

	}
}
