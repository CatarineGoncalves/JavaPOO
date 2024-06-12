import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;


public class Main {
    public static void main(String[] args) {

    // variaveis estáticas (static) servem para quando queremos uma variavel unica para cada classe que engloba todos os objetos

        Cachorro cachorro = new Cachorro("Arthur", 12, "azul", 20, 8, "feliz");
        Passaro passaro = new Passaro("Arzinho", 40, "amarelo e azul", 12, 2, "irritado");
        Gato gato = new Gato("Franklin", 5, "preto", 50, 8, "calmo");

      cachorro.sound();
      gato.sound();
      passaro.sound();
    }
}