package Exercicios;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.setNome(nome);
        this.setIdade(idade);
    }

    public Pessoa(String nome) {
        this.setNome(nome);
        this.idade = 0;
    }

    public void setNome(String nomeNovo) {
        this.nome = nomeNovo;
        System.out.println("Nome alterado com sucesso!");
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idadeNova) {
        if (idadeNova >= 0 && idadeNova <= 120) {
            this.idade = idadeNova;
            System.out.println("Idade alterada com sucesso!");
        } else {
            System.out.println("Idade inválida.");
        }
    }

    public int getIdade() {
        return this.idade;
    }

}

class TestePessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ana", 156);
        System.out.println("Nome: " + p1.getNome() + ", Idade: " + p1.getIdade());
        
        p1.setIdade(28);
        System.out.println("Nome: " + p1.getNome() + ", Idade: " + p1.getIdade());
    }
}
