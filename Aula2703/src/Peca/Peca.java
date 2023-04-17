package Peca;

public class Peca {
    
    public Peca(String nome) {
        this.nome = nome;
    }
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    @Override
    public String toString() {
        return "Peca [nome=" + nome + "]";
    }
}
