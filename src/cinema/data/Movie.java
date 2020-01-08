package cinema.data;

public class Movie {
	// attribute
	private String title;
	private int releaseDate;
	private int duration;
	 
	public Movie() {
		
	}
	
	public Movie(String title, int releaseDate) {
		this(title, releaseDate, 0);
		
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
	
	@Override
	public String toString() {
		return  title + " (" + releaseDate + (duration == 0 ? "" : ", " + duration + "mn") + ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + releaseDate;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Movie other = (Movie) obj;
		
		if (releaseDate != other.releaseDate)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
		 
	
}



 
