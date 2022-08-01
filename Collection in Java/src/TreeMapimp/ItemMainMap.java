package TreeMapimp;

import java.util.ArrayList;
import java.util.HashMap;

import CollectioninJava.Student;

public class ItemMainMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Item> al = new ArrayList<>();
		al.add(new Item(101, "kitkat", "Britania", 15));
		al.add(new Item(101, "Munch", "Nestle", 10));
		al.add(new Item(101, "Parleji", "Parle", 25));
		al.add(new Item(101, "Stick", "Britania", 25));
		al.add(new Item(101, "Neutri", "Nestle", 35));
		al.add(new Item(101, "cofee", "Nestle", 25));
		al.add(new Item(101, "Jam", "Parle", 35));
		HashMap<String, Integer> hm = new HashMap<>();
		for (Item i : al) {
			if (hm.containsKey(i.companyname)) {
				hm.put(i.companyname, hm.get(i.companyname) + 1);
			} else {
				hm.put(i.companyname, 1);
			}

		}
		System.out.println(hm);

	}

}
