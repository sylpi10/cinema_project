package test.cinema.data;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

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
				new Movie("Gran Torino", 1992, clint),
				new Movie("Joker", 2019, todd ),
				new Movie("Hungover", 2009, 100, todd)
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
		for (int i = 0; i < movies.size(); i++) {
			var movie = movies.get(i);
			System.out.println("with for : " + movie + ", directed by " + movie.getDirector());
		}
		System.out.println("");
		for (Movie movie : movies) {
			System.out.println("with foreach : " + movie + ", directed by " + movie.getDirector() );
		}
	}

}
