package TreeMapimp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class BiketreeMap  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(101,"Anjali");
		hm.put(3, "Roshan");
		hm.put(150,"Aparna");
		
		HashMap<Integer,String> hm1 = new HashMap<>();

		hm.put(10, "Sachin");
		hm.put(111, "Kajal");
		
		TreeMap<Integer,HashMap<Integer,String>> tm = new TreeMap<>();
		tm.put(1, hm);
		tm.put(2, hm1);
		
		System.out.println(tm);
		
		for(Map.Entry<Integer,HashMap<Integer,String>>ent:tm.entrySet())
			
		{
			System.out.println(ent.getKey()+" "+ent.getValue());
		}
		Iterator itr=tm.entrySet().iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
			
		}

				
		
//		TreeMap<Bike,Integer> tm = new TreeMap<>();
		
//		tm.put(new Bike(101,"Pulsor","Honda"),70000);
//		tm.put(new Bike(102,"Splender","suzuki"),69000);
//		tm.put(new Bike(103,"Hero Passion","Yamah"),65000);
//		tm.put(new Bike(104,"Hero Glamour","Bajaj"),74000);
//		tm.put(new Bike(105,"Hero Extreme","suzuki"),90000);

		System.out.println(tm);
		
//		System.out.println(tm.containsKey(new Bike(105,"Hero Extreme","suzuki")));

}

	
}