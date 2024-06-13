package antgAnimal;

public class Gato extends AnimaisDomesticos {

    private static int counterCats;

    public Gato(String name, int age, String color, int height, double weight, String emotions) {
        super(name, age, color, height, weight, emotions);

        counterCats++;
    }


    @Override
    public String toString() {
        return "Nome='" + name;
    }

    @Override
    public void sound() {
        System.out.println("MIAU");
    }
}