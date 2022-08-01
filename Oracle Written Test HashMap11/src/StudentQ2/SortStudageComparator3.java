package StudentQ2;

import java.util.Comparator;

public class SortStudageComparator3 implements Comparator<Student> {


	@Override
	public int compare(Student x1, Student x2) {
		// TODO Auto-generated method stub
		return x1.age-x2.age;
	}

}
