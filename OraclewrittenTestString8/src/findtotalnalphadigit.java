
public class findtotalnalphadigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s="kalyani1245";
			int count=0;
			int digits = 0;


//counts each character
		for(int i=0;i<s.length();i++) {
			if(Character.isLetter(s.charAt(i))) {
				count++;
			}
		if(s.charAt(i)>=48&& s.charAt(i)<=57)
		{
			digits++;
		}
		}
        	
	
	
		System.out.println("Total character string "+count+" "+digits);
		
}}