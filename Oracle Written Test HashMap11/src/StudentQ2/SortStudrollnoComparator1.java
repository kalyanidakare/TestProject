package StudentQ2;

import java.util.Comparator;

public class SortStudrollnoComparator1 implements Comparator <Student>{


	@Override
	public int compare(Student x1, Student x2) {
		// TODO Auto-generated method stub
		return x1.rollno-x2.rollno;
	}

}
