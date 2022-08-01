package StringDemo1206;

import java.util.Arrays;

public class Removeafromstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java is a programming languages";
		String str="";
       String st[]=s.split("");

    	for (int i = 0; i < st.length; i++) {
 
    		if(st[i].equals("a"))
	{
 
    			st[i]= "";
	}
    		str=str+st[i];
    	}
    	   System.out.println(str);
       }
     	
	
}