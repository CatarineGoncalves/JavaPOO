package Animal;

public class Gato extends Animal {

    public Gato(String nome, int idade, String cor, double peso) {
        super(nome, idade, cor, peso);
    }

    @Override
    public void sound() {
        System.out.println("Miau!");
    }
}
