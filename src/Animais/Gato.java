package Animais;

public class Gato {

    private String name;
    private String color;
    private String race;
    private int age;
    private int height;
    private double weight;
    private String emotions;


    public Gato(String name, String color, String race, int age, int height, double weight, String emotions) {
        this.name = name;
        this.color = color;
        this.race = race;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.emotions = emotions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public String interact(String acao) {
            switch (acao) {
                case "acaricia" -> emotions = "ronronar";
                case "briga" -> emotions = "arranhar";
                case "alimenta" -> emotions = "lamber";
                default -> emotions = "dormindo";
            }

            return this.emotions;
    }

}