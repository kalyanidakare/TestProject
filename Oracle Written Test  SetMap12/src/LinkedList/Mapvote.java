package LinkedList;
import java.util.HashMap;
import java.util.Map;

public class Mapvote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<>();
		hm.put("341254569874", "BJP");
		hm.put("432154569874", "Shivsena");
		hm.put("456341259874", "NCP");
		hm.put("874341254569", "Congress");
		hm.put("698341254574", "Others");
		hm.put("412534569874", "BJP");
		hm.put("873412545694", "BJP");
		System.out.println(hm);
		HashMap<String, Integer> hm1 = new HashMap<>();

		for (Map.Entry<String, String> ent : hm.entrySet()) {
			String s = ent.getValue();
			if (hm1.containsKey(s)) {
				int i = hm1.get(s) + 1;
				hm1.put(s, i);
			} else
				hm1.put(s, 1);

		}
		System.out.println(hm1);

	}

}
