package Queperson;

import java.util.Arrays;

public class Person {

	int pid;
	String pname, contact, address;
	Idproof idp[];

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPName() {
		return pname;
	}

	public void setPName(String pname) {
		this.pname = pname;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Idproof[] getIdp() {
		return idp;
	}

	public void setIdp(Idproof[] idp) {
		this.idp = idp;
	}

	public String toString() {

		return pid + " " + pname + " " + contact + " " + address + " " + Arrays.toString(idp);
	}
}