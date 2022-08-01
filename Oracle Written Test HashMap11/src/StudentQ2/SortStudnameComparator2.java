package StudentQ2;

import java.util.Comparator;

public class SortStudnameComparator2 implements Comparator<Student> {

	

	@Override
	public int compare(Student x1, Student x2) {
		// TODO Auto-generated method stub
		return x1.name.compareTo(x2.name);
	}

}
