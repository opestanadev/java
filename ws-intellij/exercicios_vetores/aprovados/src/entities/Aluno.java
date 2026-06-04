package entities;

public class Aluno {
    public String nome;
    public double primeiraNota, segundaNota;

    public Aluno(String nome, double primeiraNota, double segundaNota) {
        this.nome = nome;
        this.primeiraNota = primeiraNota;
        this.segundaNota = segundaNota;
    }
}
