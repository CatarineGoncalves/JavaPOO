import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Floquinho";
        cachorro1.cor = "Preto e Branco";
        cachorro1.altura = 55;
        cachorro1.peso = 9;

        System.out.println(cachorro1);

    }
}