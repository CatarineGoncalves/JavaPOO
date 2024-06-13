package Animal;

public class Cachorro extends Animal {


    public Cachorro(String nome, int idade, String cor, double peso) {
        super(nome, idade, cor, peso);
    }

    @Override
    public void sound() {
        System.out.println("Au au!");
    };


}