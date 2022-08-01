package arrayContaintmentbollygreater;

import java.util.Arrays;

public class Movie {
int id,Boxofficecollection;
String name;
Actor ac[];
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getBoxofficecollection() {
	return Boxofficecollection;
}
public void setBoxofficecollection(int boxofficecollection) {
	Boxofficecollection = boxofficecollection;
}

public Actor[] getAc() {
	return ac;
}
public void setAc(Actor[] ac) {
	this.ac = ac;
}
public String toString() {
	 	return id+" "+name+" "+Boxofficecollection+" "+Arrays.toString(ac);

}
	
}


