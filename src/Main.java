import Animais.Cachorro;
import Animais.Gato;


public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Floquinho";
        cachorro.raca = "Fox Paulistinho";
        cachorro.cor = "Preto e Branco";



        Gato gato = new Gato();
        gato.setName("Jake");
        gato.setColor("Orange");
        gato.setHeight(30);
        gato.setWeight(8);
        gato.setRace("Siames");

        System.out.println(gato.getName());

    }
}