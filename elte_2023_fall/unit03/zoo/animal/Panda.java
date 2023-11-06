package elte_2023_fall.unit03.zoo.animal;

public class Panda {
    private String name;
    private int age;
    private String country;

    public Panda(String name, String country) {
        this.name = name;
        this.age = 0;
        this.country = country;
    }

    public Panda(int age, String country) {
        this.name = String.format("%d years old foundling from %s", age, country);
        this.age = age;
        this.country = country;
    }

    public void happyBirthday(int limitYear) {

        this.age++;
        this.name = String.format("%d years old foundling from %s", age, country);
        if (this.age > limitYear) {
            this.country = "People's Republic of China";
        }
        System.out.printf("Happy birthday %s from %s on your %dth birthday", this.name, this.country, this.age);
    }

}