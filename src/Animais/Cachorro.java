package Animais;

public class Cachorro {

    public String nome;
    public String cor;
    public String raca;
    public int altura;
    public double peso;
    public String estadoDeEspirito;


    public String pegar(String acao) {

        if (acao.equals(("joguei a bolinha"))) {
            return "Correu atrás da bolinha";
        } else {
            return "está esperando você jogar a bolinha";
        }
    }

    public String interagir(String acao){
        switch (acao) {
            case "brincar" -> this.estadoDeEspirito = "feliz";
            case "dormir" -> this.estadoDeEspirito = "cansado";
            case "chutar" -> this.estadoDeEspirito = "bravo";
            default -> this.estadoDeEspirito = "neutro";
        }
        return estadoDeEspirito;
    }
}

// if (acao.equals("brincar")) {
//        this.estadoDeEspirito = "feliz";
//        } else if (acao.equals("dormir")) {
//        this.estadoDeEspirito = "cansado";
//        } else if (acao.equals("chutar")) {
//        this.estadoDeEspirito = "bravo";
//        } else {
//        this.estadoDeEspirito = "neutro";
//        }
//        return estadoDeEspirito;

//return switch (acao) {
//    case "brincar" -> "O " + nome + " pulo em você";
//    case "carinho" -> "O " + nome + " te deu uma lambida";
//    case "chutar" -> "O " + nome + " te deu mordeu e arrancou sua perna";
//    default -> "O " + nome + " ficou te olhando curioso";
//;