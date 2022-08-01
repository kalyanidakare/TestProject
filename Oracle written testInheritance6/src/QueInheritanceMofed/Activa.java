package QueInheritanceMofed;

public class Activa extends Mofed {

		int avg,weight;

		public int getAvg() {
			return avg;
		}

		public void setAvg(int avg) {
			this.avg = avg;
		}

		public int getWeight() {
			return weight;
		}

		public void setWeight(int weight) {
			this.weight = weight;
		}
	void Showroom() {
		System.out.println("Sai Point Showroom ");
	}

	public String toString() {

		return price + " " + color + " " + milage + " " + brand+" "+avg+" "+weight;
	}
		
	}


