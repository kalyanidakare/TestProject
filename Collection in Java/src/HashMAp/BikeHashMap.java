package HashMAp;

import java.util.HashMap;

public class BikeHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Bike, Integer> hm = new HashMap<>();
		
		hm.put(new Bike(101,"Pulsor","Red"),70000);
		hm.put(new Bike(102,"Splender","Black"),69000);
		hm.put(new Bike(103,"Hero Passion","Blue"),65000);
		hm.put(new Bike(104,"Hero Glamour","Red"),74000);
		hm.put(new Bike(105,"Hero Extreme","White"),90000);

		System.out.println(hm);

	}

}
