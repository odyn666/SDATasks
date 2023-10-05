package pl.hajduk.movieTask.model;

import java.util.Objects;

public class Movie {

    private String title;
    private int yearOfRelease;

    public Movie(String title, int yearOfRelease) {
        this.title = title;
        this.yearOfRelease = yearOfRelease;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getTitle() {

        return title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return yearOfRelease == movie.yearOfRelease && Objects.equals(title, movie.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, yearOfRelease);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }
}
