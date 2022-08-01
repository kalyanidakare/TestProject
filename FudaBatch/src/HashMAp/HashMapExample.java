package HashMAp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm=new HashMap<>();
//		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
//		TreeMap<Integer,String>tm=new TreeMap<>();
		hm.put(101, "ABC");
		hm.put(102, "DEF");
		hm.put(103, "LMN");
		hm.put(104, "PQR");
		hm.put(105, "XYZ");
		hm.put(106, "PQS");
		hm.put(134, "PQM");
     	System.out.println(hm);//DORSENT MAINTAIN ANY ORDER
     	System.out.println(hm.isEmpty());
     	System.out.println(hm.get(134));//give value of 134
     	System.out.println(hm.containsKey(172));//wheater is present
     	System.out.println(hm.containsValue("PQR"));
     	
     	System.out.println(hm.hashCode());
     	
     	hm.remove(101);
     	System.out.println(hm);
     	
//     	hm.clear();
//     	System.out.println(hm);
     	
     	System.out.println(hm.size());
     	
     	hm.replace(134,"STU");
     	System.out.println(hm);
     	
     	hm.put(134, "HIM");//replace stu value
     	System.out.println(hm);
     	
     	HashMap<Integer,String>hm1=new HashMap<>();
     	hm1.put(1000, "ABCD");
     	hm1.put(2000,"UVWX");
     	hm1.put(3000, "PQRS");
     	
     	hm.putAll(hm);
     	System.out.println(hm);
     	//transversing map
     	
     	for(Integer i:hm.keySet())
     	{
     		System.out.println(i);
     	}
     	for(String s:hm.values())//only values of the map
     	{
     		System.out.println(s);
     	}
     	for(Map.Entry<Integer,String>entry:hm.entrySet())
     	{
     		System.out.println(entry.getKey()+" "+entry.getValue());
     	}
     	System.out.println();
     	System.out.println("--------Iterator----------------------");
     	
//     	Set s=hm.entrySet();
//     	Iterator itr=s.iterator();
     	
     	Iterator itr=hm.entrySet().iterator();
     	while(itr.hasNext()) {
     		System.out.println(itr.next());
     	}
     	System.out.println();
     	System.out.println("----iterator using entry--------");
//     	while(itr.hasNext()) {
//     		Map.Entry<Integer,String>ent=(Map.Entry)
//     	}
     	
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
		
		lhm.put(101, "ABC");
		lhm.put(121, "DEF");
		lhm.put(131, "LMN");
		lhm.put(141, "PQR");
		lhm.put(151, "XYZ");
		System.out.println(lhm);//MAINTAIN INSERTION  ORDER
		
		TreeMap<Integer,String>tm=new TreeMap<>();
		tm.put(111, "ABC");
		tm.put(122, "ABC");
		tm.put(133, "ABC");
		tm.put(144, "ABC");
		tm.put(155, "OPQ");
		tm.put(151, "CVH");
		tm.put(161, "LMN");
		tm.put(162, "OPQ");
		System.out.println(tm);//ASCENDING ORDER
		

	}

}
