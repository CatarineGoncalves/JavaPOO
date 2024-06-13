import Animal.Animal;
import Animal.Cachorro;
import Animal.Gato;
import Animal.Passaro;
import Servicos.Petshop;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Pedro", 12, "Amarelo", 4);
        Gato gato = new Gato("Maria", 11, "Branco", 5);
        Passaro passaro = new Passaro("Piupiu", 1, "Preto", 2);


        cachorro.sound();
        gato.sound();
        passaro.sound();

        Petshop petshop = new Petshop();
        petshop.deixarNoHotel(passaro);
        petshop.darBanho(gato);

        System.out.println(gato.getEstadoDeEspirito());
        System.out.println(passaro.getEstadoDeEspirito());
        System.out.println(cachorro.getEstadoDeEspirito());
    }


}