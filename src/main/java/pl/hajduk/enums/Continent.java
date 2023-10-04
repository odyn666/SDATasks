package pl.hajduk.enums;

import java.util.ArrayList;
import java.util.Collections;
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


    public static Enum largestContinent()
    {
        List<Enum>continents=enumArray();


        Enum largest=continents.get(0);


        return largest;
    }

    public static Enum smallestContinent()
    {
        List<Enum>continents=enumArray();


        Enum smallest=continents.get(continents.size()-1);


        return smallest;
    }

    private static List<Enum> enumArray()
    {
        List<Enum>continents=new ArrayList<>();
        continents.add(NORTH_AMERICA);
        continents.add(SOUTH_AMERICA);
        continents.add(EUROPE);
        continents.add(ASIA);
        continents.add(AFRICA);
        continents.add(ANTARCTICA);
        continents.add(AUSTRALIA);
        Collections.sort(continents);
        return continents;
    }


}

