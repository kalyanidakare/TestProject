package ClassesandObjectWritten;

public class MyDate {
	
	int date,month,year,d1,m1,y1,y2;
	void setData(int d,int m,int y) 
	
	{
		date=d;
		month=m;
		year=y;
	}
	public String toStrig()
	{
		return date+" "+month+" "+year;
	}
	void print()
	{
		if(date<10&& month<10)
		{
			d1=0;
			m1=date;
			y1=0;
		}
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
