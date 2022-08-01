package TreeMapimp;

import java.util.TreeMap;

public class TreeMapExampler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(1, "Riya");
		tm.put(67, "Reena");
		tm.put(101, "Ramesh");
		tm.put(4, "Rinku");
		tm.put(89, "Rutu");
		tm.put(34, "Reema");
		tm.put(5, "Rolli");
		tm.put(20, "Roomi");
		tm.put(78, "Raj");
		tm.put(11, "Sanchita");
		tm.put(205, "Manchu");
		tm.put(67, "Sanchu");
		tm.put(120, "Ranchu");
		tm.put(105, "Vijay");

		System.out.println(tm);
		System.out.println(tm.descendingMap());

		System.out.println(tm.ceilingKey(105));// it will return immediate key which is greater than or equal to 105
		System.out.println(tm.ceilingEntry(105));// only give entry
		System.out.println(tm.floorKey(105));// return kely less than 105
		System.out.println(tm.floorEntry(105));
		
		System.out.println(tm.firstEntry());
		System.out.println(tm.firstKey());
		
		System.out.println(tm.tailMap(78,false));//give entries from 78
		
		System.out.println(tm.headMap(20,true));//end key(above 20)
		
		System.out.println(tm.subMap(5,false,105,true));
		
		System.out.println(tm.higherKey(105));//return key strictly 105
		System.out.println(tm.higherEntry(105));
		
		System.out.println(tm.lowerEntry(105));
		System.out.println(tm.lowerKey(105));//strictly less than immediate of 105

//		System.out.println(tm.);
		
	}

}
