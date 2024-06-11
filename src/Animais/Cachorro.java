package Animais;

public class Cachorro {

    public String nome;
    public String cor;
    public String raca;


    private int altura;
    private double peso;
    private String estadoDeEspirito;


    public String pegar(String acao) {

        if (acao.equals(("joguei a bolinha"))) {
            return "Correu atrás da bolinha";
        } else {
            return "está esperando você jogar a bolinha";
        }
    }

    public String interagir(String acao){
        switch (acao) {
            case "brincar" -> this.estadoDeEspirito = " está feliz";
            case "dormir" -> this.estadoDeEspirito = " parece cansado";
            case "chutar" -> this.estadoDeEspirito = " está bravo";
            default -> this.estadoDeEspirito = "não que";
        }
        return estadoDeEspirito;
    }
}

