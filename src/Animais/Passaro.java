package Animais;

public class Passaro extends AnimaisDomesticos {

    private static int counterBird;

    public Passaro(String name, int age, String color, int height, double weight, String emotions) {
        super(name, age, color, height, weight, emotions);
        counterBird++;
    }


    @Override
    public void sound() {
        System.out.println("PIU PIU");
    }
}
