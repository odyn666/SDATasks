package pl.hajduk.movieTask;

import pl.hajduk.movieTask.model.Movie;
import pl.hajduk.movieTask.repository.MovieRepository;
import pl.hajduk.movieTask.repository.MovieRepositoryApi;

import java.util.List;
import java.util.Optional;

public class MovieMain {
    public static void main(String[] args) {
        MovieRepositoryApi movieRepository = new MovieRepository();

        Movie movie1 = new Movie("Movie 1", 2000);
        Movie movie2 = new Movie("Movie 2", 2010);

        movieRepository.add(movie1);
        movieRepository.add(movie2);

        List<Movie> allMovies = movieRepository.findAll();
        System.out.println(allMovies);

        System.out.println("find by title movie 1: ");
        List<Movie> foundMovie = movieRepository.findByTitle("Movie 1");
        System.out.println(foundMovie);
    }
}
