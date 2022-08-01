package StringDemo1206;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// string creation using new keyword

				String s1 = new String("hello");
				
				String s2 = new String("hello");
				
				// string comparison using == operator
				
				if (s1 == s2)  // == Operator checks memory address  
				{
					System.out.println("s1==s2 is TRUE");
				}
				else
				{
					System.out.println("s1==s2 is FALSE");
				}
				
				// string comparison using equals method
				
				if(s1.equals(s2))  // equals method check actual content
				{
				      System.out.println("s1.equals(s2) is TRUE");
				} 
				else 
				{
				      System.out.println("s1.equals(s2) is FALSE");
				}

				

			}

	}


