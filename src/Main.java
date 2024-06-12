import Animais.Cachorro;
import Animais.Gato;


public class Main {
    public static void main(String[] args) {

    // variaveis estáticas (static) servem para quando queremos uma variavel unica para cada classe que engloba todos os objetos


        Cachorro cachorro = new Cachorro("Floquinho", 7, "Branco com Preto", "Fox Paulistinho", 40, 9);

        System.out.println(cachorro.getCounterDogs());

        Cachorro outroCachorro = new Cachorro("Espirro", 12, "Preto e Amarelo", "Vira lata", 60, 20);

        System.out.println(cachorro.getCounterDogs());

    }
}