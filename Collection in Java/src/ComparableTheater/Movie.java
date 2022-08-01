package ComparableTheater;

public class Movie {
	
	int movieid,rating,BoxOffCollection;
	String moviename;
	Movie(int movieid,String  moviename,int rating,int BoxOffCollection ) 
	
	{
		this.movieid= movieid;
		this.moviename=moviename;
		this.rating=rating;
	     this.BoxOffCollection=BoxOffCollection;
		
	}
public String toString() {
	return movieid+" "+moviename+" "+rating+" "+BoxOffCollection;
}
public int compareTo (Movie s) {
	if(this.rating>s.rating)
	{
		return 1;
	}
	else if(this.rating<s.rating)
	{
		return -1;
	}else {
		if(this.movieid>s.movieid)
			return 1;
		else if(this.movieid<s.movieid)
			return -1;
		return this.moviename.compareTo(moviename);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
