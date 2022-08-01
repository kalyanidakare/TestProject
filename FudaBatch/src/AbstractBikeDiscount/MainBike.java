package AbstractBikeDiscount;

public class MainBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pulsor p=new Pulsor();
	    p.setPulsorData(150);
		System.out.println(p);
        p.display();
		p.gears();
		p.feature();
		p.seatno();
		p.discount();
//		i1.setData(2000000, " Toyota");
//		System.out.println(i1);

		
		Activa a=new Activa();
		a.setActivaData(4, "150cc");
        System.out.println(a);
		a.display();
		a.gears();
		a.feature();
		a.seatno();
		a.discount();
		
	}
	

}
