package arrayContaintmentbollygreater;


public class Actor {
	int aid,birthyear;
	String aname,address;
	public int getId() {
		return aid;
	}
	public void setAId(int aid) {
		this.aid = aid;
	}
	public int getBirthyear() {
		return birthyear;
	}
	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}
	public String getAName() {
		return aname;
	}
	public void setAName(String aname) {
		this.aname = aname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return aid+" "+birthyear+" "+aname+" "+address;
	}
	
	
	
	}
	
	

