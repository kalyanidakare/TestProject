package ComparableTheater;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainTheater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Theater>t=new ArrayList<>();

		Scanner sc=new Scanner(System.in);
		System.out.println("No of Theaters");
		int size=sc.nextInt();
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the Theater id+name");
			int id=sc.nextInt();
			String name=sc.next();
			ArrayList<Movie>mov=new ArrayList<>();
			
			for(int j=0;j<3;j++) {
				System.out.println("Movie movieid+moviename+rating+BoxOffCollection");
				int movieid=sc.nextInt();
				String moviename=sc.next();
				int rating=sc.nextInt();
				int BoxOffCollection=sc.nextInt();
				
				mov.add(new Movie(movieid,moviename,rating,BoxOffCollection));
//				Collections.sort(mov);
			}
//			t.add(new Theater(id,name,mov));
		}
		
	}

}
