package StudentQ2;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMainComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Student>a1=new ArrayList<>();
a1.add(new Student(9,"Megha",15));
a1.add(new Student(10,"Rehansh",16));
a1.add(new Student(11,"Nehansh",13));
a1.add(new Student(12,"Priyansh",14));
a1.add(new Student(8,"Nikhilesh",12));
a1.add(new Student(14,"Meena",16));

Collections.sort(a1,new SortStudrollnoComparator1());
System.out.println(a1);
Collections.sort(a1,new SortStudnameComparator2());
System.out.println(a1);
Collections.sort(a1,new SortStudageComparator3());
System.out.println(a1);


	}

}
