package TreeMapimp;


public class Item {
	int id,cost;
	String name,companyname;
	
	Item(int id,String name,String companyname,int cost){
		this.id=id;
		this.name=name;
		this.companyname=companyname;
		this.cost=cost;

	}
	public String toString() {
		return id+" "+name+" "+companyname+" "+cost;
		}

}
