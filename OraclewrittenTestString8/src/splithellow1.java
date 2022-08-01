import java.util.Arrays;

public class splithellow1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "HELLO$WORD";
		String str="";
       String st[]=s.split("");
       

    	for (int i = 0; i < st.length; i++) {
 
    		if(st[i].equals("$"))
	{
 
    			st[i]= "  ";
	}
    		str=str+ st[i];
    	}
    	   System.out.print(str);
       }
     	

	}


