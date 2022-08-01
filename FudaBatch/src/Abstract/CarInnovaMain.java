package Abstract;

public class CarInnovaMain {

	public static void main(String[] args) {

		InnovaCresta i1 = new InnovaCresta();
		i1.setData(2000000, " Toyota");
		System.out.println(i1);
		i1.wheelno();
		i1.gears();
		i1.dashboard();
		i1.engine();
		i1.noOfSeats();
		i1.wheelType();

		System.out.println();
//		Fortuner f = new Fortuner();
//		f.setData(4500000, "Toyota");
//		System.out.println(f);
//		f.dashboard();
//		f.engine();
//		f.noOfSeats();

	}
}