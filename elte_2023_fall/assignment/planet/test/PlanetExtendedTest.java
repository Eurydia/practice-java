package elte_2023_fall.assignment.planet.test;

import org.junit.Test;

import elte_2023_fall.assignment.planet.Planet;
import elte_2023_fall.assignment.planet.plant.Planter;

import static org.junit.Assert.assertArrayEquals;

public class PlanetExtendedTest {
        @Test
        public void init2() {

                Planter c = new Planter(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });

                c.growPlants();

                assertArrayEquals(
                                new int[] { 1, 2, 6, 4, 5, 6, 7, 8 },
                                c.getPlantCounts());

        }

        @Test
        public void encapsulation() {

                int[] counts = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
                assertArrayEquals(
                                new int[] { 1, 2, 3, 4, 5, 6, 7, 8 },
                                counts);

                Planter c = new Planter(counts);
                counts[0] = 100;

                int[] count2 = c.getPlantCounts();
                count2[0] = 200;

                assertArrayEquals(
                                new int[] { 1, 2, 3, 4, 5, 6, 7, 8 },
                                c.getPlantCounts());

        }

        @Test
        public void init3() {

                Planter c = new Planter(
                                new int[] { 1, 2, 3, 4, 5, 6, 7, 8 },
                                Planet.JUPITER);
                c.growPlants();

                assertArrayEquals(
                                new int[] { 1, 2, 3, 4, 10, 6, 7, 8 },
                                c.getPlantCounts());
        }
}