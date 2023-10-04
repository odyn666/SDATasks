package pl.hajduk.enums;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

enum Continent {
    NORTH_AMERICA("North America", 24709000),
    SOUTH_AMERICA("South America", 17840000),
    EUROPE("Europe", 10180000),
    ASIA("Asia", 44360000),
    AFRICA("Africa", 30370000),
    AUSTRALIA("Australia", 8600000),
    ANTARCTICA("Antarctica", 14000000);

    private final String name;
    private final long surfaceArea;

    Continent(String name, long surfaceArea) {
        this.name = name;
        this.surfaceArea = surfaceArea;
    }

    public String getName() {
        return name;
    }

    public long getSurfaceArea() {
        return surfaceArea;
    }

    public static Continent largestContinent() {
        List<Continent> continents = enumList();
        return continents.get(continents.size() - 1);
    }

    public static Continent smallestContinent() {
        List<Continent> continents = enumList();
        return continents.get(0);
    }

    private static List<Continent> enumList() {
        List<Continent> continents = new ArrayList<>();
        Collections.addAll(continents, values());

        continents.sort(Comparator.comparingLong(Continent::getSurfaceArea));

        return continents;
    }
}
