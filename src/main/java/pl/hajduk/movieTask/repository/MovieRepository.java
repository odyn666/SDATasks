package pl.hajduk.movieTask.repository;

import pl.hajduk.movieTask.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository implements MovieRepositoryApi{
    private List<Movie> movies;

    public MovieRepository() {
        this.movies = new ArrayList<>();
    }

    @Override
    public void add(Movie movie) {
        movies.add(movie);
    }

    @Override
    public void delete(Movie movie) {
        movies.remove(movie);
    }

    @Override
    public List<Movie> findAll() {
        return new ArrayList<>(movies);
    }

    @Override
    public List<Movie> findByTitle(String title) {
        for (Movie movie : movies) {
            if (movie.getTitle().equals(title)) {
                return List.of(movie);
            }
        }
        return null;
    }
}
