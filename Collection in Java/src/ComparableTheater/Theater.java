package ComparableTheater;

import java.util.ArrayList;

public class Theater {

	int id;
	String name;
	ArrayList<Movie>mov;{
		this.id=id;
		this.name=name;
		this.mov=mov;
	}
	public String toString() {
		return id+" "+name+" "+mov;
	}
}
