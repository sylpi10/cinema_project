package cinema.data;

import java.util.Objects;

public class Movie {
	// attribute
	private String title;
	private int releaseDate;
	private int duration;
	private Person director;
	 
	public Movie() {
		
	}
	
	public Movie(String title, int releaseDate) {
		this(title, releaseDate, 0);
		
	}
	
	public Movie(String title, int releaseDate, int duration) {
		this(title, releaseDate, duration, null);
	}
	
	

	public Movie(String title, int releaseDate, int duration, Person director) {
		super();
		this.title = Objects.requireNonNull(title);
		this.releaseDate = releaseDate;
		this.duration = duration;
		this.director = director;
	}

	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = Objects.requireNonNull(title);
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
	
	
	public Person getDirector() {
		return director;
	}

	public void setDirector(Person director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return  title + " (" + releaseDate + (duration == 0 ? "" : ", " + duration + "mn") + ")";
	}

	@Override
	public int hashCode() {
		return Objects.hash(title, releaseDate);
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

		return this.title.equals(other.title)
				&& this.releaseDate == other.releaseDate;
		
//		if (releaseDate != other.releaseDate)
//			return false;
//		if (title == null) {
//			if (other.title != null)
//				return false;
//		} else if (!title.equals(other.title))
//			return false;
//		return true;
	}
		 
	
}



 
