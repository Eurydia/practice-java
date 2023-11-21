package github.eurydia.elte.fall2023.assignment.planet.test;

import org.junit.Test;

import github.eurydia.elte.fall2023.assignment.planet.Planet;
import github.eurydia.elte.fall2023.assignment.planet.plant.Planter;

import static org.junit.Assert.assertEquals;

public class PlanetCompulsoryTest {
    @Test
    public void init() {
        Planter planter = new Planter();

        assertEquals(0, planter.getPlantCount(Planet.MERCURY));
        assertEquals(0, planter.getPlantCount(Planet.VENUS));
        assertEquals(100, planter.getPlantCount(Planet.EARTH));
        assertEquals(0, planter.getPlantCount(Planet.MARS));
        assertEquals(0, planter.getPlantCount(Planet.JUPITER));
        assertEquals(0, planter.getPlantCount(Planet.SATURN));
        assertEquals(0, planter.getPlantCount(Planet.NEPTUNE));
        assertEquals(0, planter.getPlantCount(Planet.URANUS));
    }

    @Test
    public void addPlant() {
        Planter planter = new Planter();

        planter.addPlant(Planet.EARTH);

        assertEquals(0, planter.getPlantCount(Planet.MERCURY));
        assertEquals(0, planter.getPlantCount(Planet.VENUS));
        assertEquals(101, planter.getPlantCount(Planet.EARTH));
        assertEquals(0, planter.getPlantCount(Planet.MARS));
        assertEquals(0, planter.getPlantCount(Planet.JUPITER));
        assertEquals(0, planter.getPlantCount(Planet.SATURN));
        assertEquals(0, planter.getPlantCount(Planet.NEPTUNE));
        assertEquals(0, planter.getPlantCount(Planet.URANUS));
    }

    @Test
    public void growOnEarth() {
        Planter planter = new Planter();

        planter.growPlants();

        assertEquals(0, planter.getPlantCount(Planet.MERCURY));
        assertEquals(0, planter.getPlantCount(Planet.VENUS));
        assertEquals(200, planter.getPlantCount(Planet.EARTH));
        assertEquals(0, planter.getPlantCount(Planet.MARS));
        assertEquals(0, planter.getPlantCount(Planet.JUPITER));
        assertEquals(0, planter.getPlantCount(Planet.SATURN));
        assertEquals(0, planter.getPlantCount(Planet.NEPTUNE));
        assertEquals(0, planter.getPlantCount(Planet.URANUS));
    }

    @Test
    public void growMoveThenGrow() {
        Planter planter = new Planter();

        planter.movePlants(30, Planet.EARTH, Planet.MARS);
        planter.movePlants(20, Planet.EARTH, Planet.NEPTUNE);
        planter.movePlants(15, Planet.MARS, Planet.NEPTUNE);
        planter.growPlants();

        assertEquals(0, planter.getPlantCount(Planet.MERCURY));
        assertEquals(0, planter.getPlantCount(Planet.VENUS));
        assertEquals(50, planter.getPlantCount(Planet.EARTH));
        assertEquals(15, planter.getPlantCount(Planet.MARS));
        assertEquals(0, planter.getPlantCount(Planet.JUPITER));
        assertEquals(0, planter.getPlantCount(Planet.SATURN));
        assertEquals(70, planter.getPlantCount(Planet.NEPTUNE));
        assertEquals(0, planter.getPlantCount(Planet.URANUS));
    }
}
