package Animais;

public class Gato {

    private String name;
    private String color;
    private String race;
    private int height;
    private double weight;
    private String emotions;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name.equals(("Garfield"))) {
            this.name = null;
        } else {
            this.name = name;
        }

        this.name = name;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getEmotions() {
        return emotions;
    }

    public void setEmotions(String emotions) {
        this.emotions = emotions;
    }

}
