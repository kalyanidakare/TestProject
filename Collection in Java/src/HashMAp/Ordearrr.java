package HashMAp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Ordearrr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Order> a1 = new ArrayList<>();
		a1.add(new Order(101, 222, "Mumbai", "Pending"));
		a1.add(new Order(102, 111, "Pune", "Delivered"));
		a1.add(new Order(103, 333, "Nashik", "Pending"));
		a1.add(new Order(104, 214, "Satara", "Delivered"));
		a1.add(new Order(105, 232, "Ratagiri", "Pending"));

		System.out.println(a1);

		HashMap<String, Integer> hm = new HashMap<>();
		for (Order s : a1) {
			if (s.status.equals("Pending")) {
				if (hm.containsKey(s.city)) {

					int i = hm.get(s.city) + 1;
					hm.put(s.city, i);
				} else {
					hm.put(s.city, 1);
				}

			}

		}
		System.out.println(hm);

	}

}
