package Animal;

public class Passaro extends Animal {

    public Passaro(String nome, int idade, String cor, double peso) {
        super(nome, idade, cor, peso);
    }

    @Override
    public void sound() {
        System.out.println("Piu piu!");
    }
}
