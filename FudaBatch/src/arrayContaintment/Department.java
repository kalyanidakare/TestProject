package arrayContaintment;

import java.util.Arrays;

public class Department {
	
	int did;
	String dname;
	Student stud[];
	
	Department(int id,String dname, Student[] stud) {
		
		this.did=did;
		this.dname=dname;

	}
	
	public String toString()
	{
		return did+" "+dname+" "+Arrays.toString(stud);
	}

}
