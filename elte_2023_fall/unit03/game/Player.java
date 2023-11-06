package elte_2023_fall.unit03.game;

import elte_2023_fall.unit03.game.utils.Vehicle;

public class Player {
    // A player has a name (String), an IP-address (String), an integer value
    // describing their health, and their vehicle (of type Vehicle). If the player
    // has no vehicle, a null reference should be stored.
    private String name;
    private String ipAddress;
    private int health;
    Vehicle vehicle = null;

    public String toString() {

        if (this.vehicle == null) {
            return String.format("Name=%s; IP=%s; Health=%d", this.name, this.ipAddress, this.health);
        }
        return String.format("Name=%s; IP=%s; Health=%d; Car=%s", this.name, this.ipAddress, this.health,
                this.vehicle.toString());

    }
}
