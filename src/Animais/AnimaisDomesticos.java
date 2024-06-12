package Animais;

public class AnimaisDomesticos {
    protected String name;
    protected int age;
    protected String color;
    protected int height;
    protected double weight;
    protected String emotions;

    public AnimaisDomesticos(String name, int age, String color, int height, double weight, String emotions) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.emotions = emotions;
    }

    protected void eat() {}

    protected void sleep() {}

    public void sound() {
        System.out.println(" cri cri ");
    }

}
