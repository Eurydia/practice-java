package github.eurydia.elte.fall2023.assignment.planet.test;

import org.junit.Test;

import github.eurydia.elte.fall2023.assignment.planet.Planet;
import github.eurydia.elte.fall2023.assignment.planet.plant.Planter;

import static org.junit.Assert.assertEquals;

public class PlanetCompulsoryTest {
    @Test
    public void init() {
        Planter company = new Planter();

        assertEquals(0, company.getPlantCount(Planet.MERCURY));
        assertEquals(0, company.getPlantCount(Planet.VENUS));
        assertEquals(100, company.getPlantCount(Planet.EARTH));
        assertEquals(0, company.getPlantCount(Planet.MARS));
        assertEquals(0, company.getPlantCount(Planet.JUPITER));
        assertEquals(0, company.getPlantCount(Planet.SATURN));
        assertEquals(0, company.getPlantCount(Planet.NEPTUNE));
        assertEquals(0, company.getPlantCount(Planet.URANUS));
    }

    @Test
    public void addPlant() {
        Planter company = new Planter();

        company.addPlant(Planet.EARTH);

        assertEquals(0, company.getPlantCount(Planet.MERCURY));
        assertEquals(0, company.getPlantCount(Planet.VENUS));
        assertEquals(101, company.getPlantCount(Planet.EARTH));
        assertEquals(0, company.getPlantCount(Planet.MARS));
        assertEquals(0, company.getPlantCount(Planet.JUPITER));
        assertEquals(0, company.getPlantCount(Planet.SATURN));
        assertEquals(0, company.getPlantCount(Planet.NEPTUNE));
        assertEquals(0, company.getPlantCount(Planet.URANUS));
    }

    @Test
    public void growOnEarth() {
        Planter company = new Planter();

        company.growPlants();

        assertEquals(0, company.getPlantCount(Planet.MERCURY));
        assertEquals(0, company.getPlantCount(Planet.VENUS));
        assertEquals(200, company.getPlantCount(Planet.EARTH));
        assertEquals(0, company.getPlantCount(Planet.MARS));
        assertEquals(0, company.getPlantCount(Planet.JUPITER));
        assertEquals(0, company.getPlantCount(Planet.SATURN));
        assertEquals(0, company.getPlantCount(Planet.NEPTUNE));
        assertEquals(0, company.getPlantCount(Planet.URANUS));
    }

    @Test
    public void growMoveThenGrow() {
        Planter company = new Planter();

        company.movePlants(30, Planet.EARTH, Planet.MARS);
        company.movePlants(20, Planet.EARTH, Planet.NEPTUNE);
        company.movePlants(15, Planet.MARS, Planet.NEPTUNE);
        company.growPlants();

        assertEquals(0, company.getPlantCount(Planet.MERCURY));
        assertEquals(0, company.getPlantCount(Planet.VENUS));
        assertEquals(50, company.getPlantCount(Planet.EARTH));
        assertEquals(15, company.getPlantCount(Planet.MARS));
        assertEquals(0, company.getPlantCount(Planet.JUPITER));
        assertEquals(0, company.getPlantCount(Planet.SATURN));
        assertEquals(70, company.getPlantCount(Planet.NEPTUNE));
        assertEquals(0, company.getPlantCount(Planet.URANUS));
    }
}
