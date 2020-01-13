package test.cinema.data;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cinema.data.Movie;
import cinema.data.Person;

class TestCinema {

	private List<Movie> movies;
	private List<Person> persons;

	@BeforeEach
	void initData() {
		persons = new ArrayList<>();
		Collections.addAll(persons, 
				 new Person("Joaquin Phoenix", LocalDate.of(1974, 10, 28)),
				 new Person("Gérard Darmon", LocalDate.of(1948, 02, 29)),
				 new Person("Todd Phillips"),
				 new Person("Clint Eastwood", LocalDate.of(1930, 05, 31)),
				 new Person("Todd Phillips")
				);
		
		var clint =  persons.get(3);		
		var todd =  persons.get(2);		

		movies = new ArrayList<>();
		Collections.addAll(movies, 
				new Movie("Unforgiven", 1992, 116, clint),
				new Movie("Interstallar", 2014, 120),
				new Movie("Gran Torino", 2009, clint),
				new Movie("Joker", 2019, todd ),
				new Movie("Hangover", 2009, 100, todd),
				new Movie("American Sniper", 2016, 140, clint)
				
				);
	}
	
	@Test
	void testModifiableList() {
		System.out.println(persons);
		System.out.println(persons.getClass());
		persons.add(new Person("Bradley Cooper", LocalDate.of(1975, 01, 05)));
		System.out.println(persons);
		System.out.println("movies : \n" + movies);
	}
	
	@Test
	void displayMovie() {
		// forI loop
		System.out.println("with for : ");
		for (int i = 0; i < movies.size(); i++) {
			var movie = movies.get(i);
			System.out.println("     " + movie + ", directed by " + movie.getDirector());
		}
		
		// foreach
		System.out.println("\nwith foreach : ");
		for (Movie movie : movies) {
			System.out.println("    " + movie + ", directed by " + movie.getDirector() );
		}
	}
	
	@Test
	void totalDurationClintMovies() {
		int totalDuration = 0;
		for (Movie movie : movies) {
			
			if (Objects.nonNull(movie.getDirector()) && movie.getDirector().getName() == "Clint Eastwood") {
				totalDuration += movie.getDuration();
			}
		}
		System.out.println("total duration : " + totalDuration);
	}
	
	@Test
	void testSortedMovies() {
		SortedSet<Movie> sortedMovies = new TreeSet<>(
				Comparator.comparing(Movie::getReleaseDate, Comparator.reverseOrder())
				.thenComparing(Movie::getTitle));
//				(m1, m2) -> -1);
		sortedMovies.addAll(movies);
		System.out.println(movies);
	}

	@Test
	void testSortMovies() {
		Collections.sort(movies, Comparator.comparing(Movie::getReleaseDate).thenComparing(Movie::getTitle));
		System.out.println(movies);
	}

}
