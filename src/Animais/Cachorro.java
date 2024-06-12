package Animais;

public class Cachorro {

    private String name;
    private int age;
    private String gender;
    private String color;
    private String race;
    private int height;
    private double weight;
    private String emotions;

    //constructor
    public Cachorro(String name, int age, String color, String race, int height, double weight, String emotions) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.race = race;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public String interact(String acao) {
        switch (acao) {
            case "assobia" -> emotions = "corre";
            case "briga" -> emotions = "morde";
            case "brinca" -> emotions = "pula";
            default -> emotions = "deita";
        }

        return this.emotions;
    }


    public String toString() {
        return String.format("Nome: %s, Idade: %d, Cor: %s, Raça: %s, Altura: %d, Peso: %.1f, Ação: %s",
                name, age, color, race, height, weight, emotions);
    }


}





