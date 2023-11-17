package github.eurydia.elte.fall2023.assignment.planet.plant;

import github.eurydia.elte.fall2023.assignment.planet.Planet;

public class Planter {
    private int[] plantCounts;
    private Planet planterLocation;

    public Planter() {

        this.plantCounts = new int[Planet.values().length];
        this.plantCounts[Planet.EARTH.getIntRepr()] = 100;
        this.planterLocation = Planet.EARTH;
    }

    public Planter(int[] prevData) {
        this();
        if (prevData.length != Planet.values().length) {
            String errorMsg = String.format(
                    "Invalid array length. Expected %d, got %d.",
                    Planet.values().length,
                    prevData.length);
            throw new IllegalArgumentException(errorMsg);
        }

        this.plantCounts = new int[Planet.values().length];
        for (int i = 0; i < prevData.length; i++) {
            this.plantCounts[i] = prevData[i];
        }

        this.planterLocation = Planet.EARTH;
    }

    public Planter(
            int[] prevData,
            Planet planterLocation) {

        this(prevData);
        this.planterLocation = planterLocation;
    }

    public int getPlantCount(Planet planet) {
        return this.plantCounts[planet.getIntRepr()];
    }

    public int[] getPlantCounts() {

        int[] plantCounts = new int[Planet.values().length];

        for (Planet p : Planet.values()) {
            plantCounts[p.getIntRepr()] = this.getPlantCount(p);
        }

        return plantCounts;
    }

    public void addPlant(Planet planet) {
        this.plantCounts[planet.getIntRepr()] += 1;
        this.planterLocation = planet;
    }

    public void movePlants(
            int amount,
            Planet originPlanet,
            Planet targetPlanet) {

        if (this.getPlantCount(originPlanet) < amount) {

            String errorMessage = String.format(
                    "Not enough plants from %s. (%d of %d need)",
                    originPlanet.getStringRepr(),
                    this.getPlantCount(originPlanet),
                    amount);

            throw new IllegalArgumentException(errorMessage);
        }

        this.plantCounts[originPlanet.getIntRepr()] -= amount;
        this.plantCounts[targetPlanet.getIntRepr()] += amount;
        this.planterLocation = targetPlanet;
    }

    public void growPlants() {
        this.plantCounts[this.planterLocation.getIntRepr()] *= 2;
    }

    public void growPlantsByDistanceFrom(Planet originPlanet) {
        for (Planet p : Planet.values()) {
            int distance = Math.abs(p.getIntRepr() - originPlanet.getIntRepr());
            this.plantCounts[p.getIntRepr()] += distance;
        }
    }

}
