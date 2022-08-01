package TreeMapimp;

import java.util.TreeMap;


public class CartreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer,Car> tm = new TreeMap<>();
		tm.put(111,new Car("Maruti","s-preso",400000,2012));
		tm.put(222,new Car("Hundai","i20",900000,2014));
		tm.put(333,new Car("Honda","Jazz",800000,2015));
		tm.put(444,new Car("Kia","Carens",700000,2011));

				System.out.println(tm);


	}

}
