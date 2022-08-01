package StudentQ2;

import java.util.ArrayList;
import java.util.HashMap;

public class FrequencycityQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al=new ArrayList();
		al.add("pune");
		al.add("Mumbai");
		al.add("pune");
		al.add("Mumbai");
		al.add("Nasik");
		al.add("pune");
		
		System.out.println(al);
		HashMap<String,Integer>hm=new HashMap<>();	
		
		for(String s:al)
		{
			if(hm.containsKey(s))
			{
				int i=hm.get(s)+1;
				hm.put(s,i);
			}
			else
				hm.put(s, 1);
		}
		System.out.println(hm);

	}

}
