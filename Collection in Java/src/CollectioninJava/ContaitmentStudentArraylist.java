package CollectioninJava;

import java.util.ArrayList;

public class ContaitmentStudentArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> st1 = new ArrayList<>();

		st1.add(60);
		st1.add(65);
		st1.add(70);
		st1.add(80);

		ArrayList<Studentcontaintmet> a1 = new ArrayList<>();
		a1.add(new Studentcontaintmet(101, "Rashmi", "Computer", st1));

		ArrayList<Integer> st2 = new ArrayList<>();

		st2.add(60);
		st2.add(85);
		st2.add(60);
		st2.add(80);

		a1.add(new Studentcontaintmet(102, "Rashi", "Computer", st2));
		ArrayList<Integer> st3 = new ArrayList<>();

		st3.add(60);
		st3.add(60);
		st3.add(70);
		st3.add(80);

		a1.add(new Studentcontaintmet(103, "Ranu", "Computer", st3));
		ArrayList<Integer> st4 = new ArrayList<>();

		st4.add(60);
		st4.add(60);
		st4.add(70);
		st4.add(75);

		a1.add(new Studentcontaintmet(104, "Ramni", "Computer", st4));

		for (Studentcontaintmet s : a1) {
			int sum = 0;
			for (Integer i : s.marks) {
				sum += i;
			}
			double percent = sum / s.marks.size();
			if (percent > 65)
				;
			System.out.println(s.name + " " + percent);
		}

	}

}
