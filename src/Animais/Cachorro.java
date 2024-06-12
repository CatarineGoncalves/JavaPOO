package Animais;

public class Cachorro extends AnimaisDomesticos {

    private static int counterDogs;


    public Cachorro(String name, int age, String color, int height, double weight, String emotions) {
        super(name, age, color, height, weight, emotions);
        counterDogs++;
    }

    public static int getCounterDogs() {
        return counterDogs;
    }

    public static void setCounterDogs(int counterDogs) {
        Cachorro.counterDogs = counterDogs;
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

    @Override
    public String toString() {
        return String.format("Nome: %s, Idade: %d, Cor: %s, Raça: %s, Altura: %d, Peso: %.1f",
                name, color, weight);
    }

    @Override
    public void sound() {
        System.out.println("AU AU");
    }
}





