package CollectioninJava;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveEvennoArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			a1.add(sc.nextInt());
		}

		ArrayList<Integer> a = new ArrayList<Integer>();

		for (int i = 0; i < a.size(); i++) {
			int cnt = 0;
			for (int j = 0; j < a.size(); j++) {
				if (a.get(i) == a.get(i) && j < i) {
					break;
				} else if (a.get(i) == a.get(j) && j >= i) {
					cnt++;
				}
			}
			if (cnt != 2) {
				a.add(a.get(i));
			}
		}
		System.out.println(a);

		for (Integer i : a) {
			if (a.contains(i)) {
				a.add(i);
			}
			
			

//ArrayList<Integer>a1=new ArrayList<>();
//Scanner sc=new Scanner (System.in);
//for(int i=0;i<10;i++)
//{
//	a1.add(sc.nextInt());
//	}
		}

	}
}