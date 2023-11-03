package elte_2023_fall.assignment.planet;

public enum Planet {
    MERCURY("Mercury", 0),
    VENUS("Venus", 1),
    EARTH("Earth", 2),
    MARS("Mars", 3),
    JUPITER("Jupiter", 4),
    SATURN("Saturn", 5),
    URANUS("Uranus", 6),
    NEPTUNE("Neptune", 7);

    private String stringRepr;
    private int intRepr;

    private Planet(String stringRepr, int intRepr) {
        this.stringRepr = stringRepr;
        this.intRepr = intRepr;

    }

    public String getStringRepr() {
        return this.stringRepr;
    }

    public int getIntRepr() {
        return this.intRepr;
    }

}
