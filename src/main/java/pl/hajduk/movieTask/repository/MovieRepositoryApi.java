package pl.hajduk.movieTask.repository;

import pl.hajduk.movieTask.model.Movie;

import java.util.List;

public interface MovieRepositoryApi{

    void add(Movie movie);

    void delete(Movie movie);

    List<Movie> findAll();

    List<Movie> findByTitle(String title);

}
