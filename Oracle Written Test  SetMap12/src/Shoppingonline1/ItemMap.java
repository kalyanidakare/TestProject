package Shoppingonline1;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Item> al = new ArrayList<>();
		al.add(new Item(112, "ParleG", 20, 10));
		al.add(new Item(113, "GoodDay", 40, 30));
		al.add(new Item(112, "ParleG", 20, 5));
		al.add(new Item(113, "GoodDay", 40, 10));

		System.out.println(al);
		HashMap<String, Integer> hm = new HashMap<>();

		for (Item i : al) {
			if (hm.containsKey(i.name))
			{
				int sum=hm.get(i.name)+i.qty;
				hm.put(i.name, sum);
			} else {
				hm.put(i.name, i.qty);
			}

		}
		System.out.println(hm);

	}

}
 