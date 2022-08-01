package StudentQ2;
//to create a class Student with (rollNo, nameand age). 
//Create 3 Comparator implementations for each Student attribute
//(i.e. rollNo, name and age)

public class Student {
	int rollno,age;
	String name;
	
	Student(int rollno,String name,int age){
		this.rollno=rollno;
		this.name=name;
        this.age=age;
		
	}
	public String toString() {
		return rollno+" "+name+" "+age;
		
	}

}
