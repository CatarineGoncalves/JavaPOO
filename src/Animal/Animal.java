package Animal;

public abstract class Animal {
    protected String nome;
    protected int idade;
    protected String cor;
    protected double peso;
    protected String estadoDeEspirito;


    public Animal(String nome, int idade, String cor, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
        this.peso = peso;
    }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }

    public void setIdade(int idade) { this.idade = idade; }

    public String getCor() { return cor; }

    public void setCor(String cor) { this.cor = cor; }

    public double getPeso() { return peso; }

    public void setPeso(double peso) { this.peso = peso; }

    public String getEstadoDeEspirito() { return estadoDeEspirito; }

    public void setEstadoDeEspirito(String estadoDeEspirito) { this.estadoDeEspirito = estadoDeEspirito; }

    public abstract void sound();

}
