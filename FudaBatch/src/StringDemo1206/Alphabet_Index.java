package StringDemo1206;

public class Alphabet_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "the quick brown for jumps over the lazy dog";
		char ch[]=s.toCharArray();
		
		for(char i='a';i<='z';i++) 
		{
		for(int j=0;j<ch.length;j++)
			{
				if(i==ch[j])
				{
					System.out.println(i+" = "+j);
				}
			}

		}
		

	}

}
