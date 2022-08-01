package Inheritanceisarelation;


public class BikeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Pulsor p1 = new Pulsor();
//		p1.setBikeData(101, "Red", "60 km/hr", " Bajaj");
//		p1.setPulsorData("Pulsor", 120, "Alpha");
//        System.out.println(p1);
//		p1.gears();
//		p1.wheelno();
//		p1.engine();
	
		PulsorRs ps=new PulsorRs();
		ps.setBikeData(100000, "Black", "40 km/ltr","Bajaj");
		ps.setPulsorData("Pulsor Rs", 150,"Rs 150");
		ps.setPulsorRsData("BS 6",140);
		System.out.println(ps);
		ps.wheelno();
		ps.gears();

	}

}
