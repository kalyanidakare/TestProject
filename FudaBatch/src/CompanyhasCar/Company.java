package CompanyhasCar;

public class Company {
int cid,cyear;
String cname;
Car c;

public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public int getCyear() {
	return cyear;
}
public void setCYear(int cyear) {
	this.cyear = cyear;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getC() {
	return getC();
}
public void setC(Car c ) {
	this.c = c;
}


public String toString()
{
	return cid+" "+cname+" "+cyear+" "+c;
}
	
}



