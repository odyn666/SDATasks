package pl.hajduk.footballerTask;

import pl.hajduk.footballerTask.logic.FootballerDatabase;
import pl.hajduk.footballerTask.model.Club;
import pl.hajduk.footballerTask.repositories.FootballerRepository;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        FootballerRepository repository = new FootballerDatabase();
        // System.out.println(repository.findAll());
        System.out.println("******************");
        System.out.println(repository.findFootballersByClub("FC Barcelona"));

        List<String> listClubs = repository.findAll().stream()
                .flatMap(player -> player.getPreviousClubs()
                        .stream())
                .map(Club::getClubName)
                .distinct()
                .toList();

        Set<String> uniqueClubs = repository.findAll().stream()
                .flatMap(player -> player.getPreviousClubs().stream())
                .map(Club::getClubName)
                .collect(Collectors.toSet());
        System.out.println("liczba unikalnych klubów" + listClubs.size());
        System.out.println(uniqueClubs);

// szukanie po miejsciu zamieszkania

        System.out.println(repository.findByCity("paris"));

    }
}
