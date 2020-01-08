package test.cinema.data;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cinema.data.Movie;

class TestMovie {

	@Test
	void test() {
		Movie movie = new Movie("joker", 2019, 165);
//		movie.setTitle("joker");
		System.out.println(movie.getTitle());
	}

}
