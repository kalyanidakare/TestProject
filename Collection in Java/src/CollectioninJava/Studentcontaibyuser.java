package CollectioninJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//import arrayContaintment.Student;

public class Studentcontaibyuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Studentcontaintmet> st1 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student no");
		int d = sc.nextInt();

		for (int i = 0; i < d; i++) {
			System.out.println("Enter the id,name+dept:");
			int id = sc.nextInt();
			String name = sc.next();
			String dept = sc.next();
			ArrayList<Integer> s = new ArrayList<>();

			for (int j = 0; j < 3; j++)// student:3
			{
				System.out.println("Enter the student marks");
				int marks = sc.nextInt();
				s.add(marks);
			}
			st1.add(new Studentcontaintmet(id, name, dept, s));
		}
		for (Studentcontaintmet m : st1) {
			int sum = 0;
			for (Integer i : m.marks) {
				sum += i;
			}
			double percent = sum / m.marks.size();
			if (percent > 65) {
				System.out.println(m.name + " " + percent);
			}

			{

			}

		}
	}
}
