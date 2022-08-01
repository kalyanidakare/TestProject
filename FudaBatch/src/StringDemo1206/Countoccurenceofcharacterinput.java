package StringDemo1206;

public class Countoccurenceofcharacterinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Javgga";
		int count=0;
		for(char ch:str.toCharArray()) {
			if(ch=='g') {
				count++;
			}
			else if(ch=='a') {
				count++;
			}
			
		}
		System.out.println(count);
		
	}

}
