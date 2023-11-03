package elte_2023_fall.week03.game.utils;

public class Vehicle {
    private int color1;
    private int color2;
    private int modelId;
    private String registrationNumber;

    public Vehicle(int color1, int color2, int modelId, String registrationNumber) {
        this.color1 = color1;
        this.color2 = color2;
        this.modelId = modelId;
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

}
