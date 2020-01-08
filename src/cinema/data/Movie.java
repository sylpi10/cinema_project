package cinema.data;

public class Movie {
	// attribute
	private String title;
	private int releaseDate;
	private int duration;
	 
	public Movie() {
		
	}
	
	public Movie(String title, int releaseDate, int duration) {
		super();
		this.title = title;
		this.releaseDate = releaseDate;
		this.duration = duration;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getReleaseDate() {
		return releaseDate;
	}


	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}
	 
}



 
