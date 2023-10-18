package pl.hajduk.footballerTask.repositories;

import pl.hajduk.footballerTask.model.Footballer;

import java.util.List;

public interface FootballerRepository {
    List<Footballer> add(Footballer footballer);
    List<Footballer> delete(Footballer footballer);
    List<Footballer> findByLastName(String footballer);
    List<Footballer> findFootballersByClub(String clubName);
    List<Footballer> findAll();
    List<Footballer> findByCity(String cityName);
}
