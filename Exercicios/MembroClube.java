package Exercicios;
import java.util.ArrayList;
import java.util.List;

public abstract class MembroClube {

    private String nome;
    private int idade;

    public MembroClube(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome) { this.nome = nome; }
    public String getNome() { return this.nome; }
    public void setIdade(int idade) { this.idade = idade; }
    public int getIdade() { return this.idade; }

    public void apresentar() {
        System.out.println("Nome: " + this.nome + ", Idade: " + this.idade);
    }
}

interface Autenticavel  {
    boolean login(String senha);
}

class Presidente extends MembroClube implements Autenticavel{
    private String senha;

    public Presidente(String nome, int idade, String senha) {
        super(nome, idade);
        this.senha = senha;
    }

    public void setSenha(String senha) { this.senha = senha; }
    public String getSenha() { return this.senha; }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Cargo: Presidente");
    }
    
    @Override
    public boolean login(String senha) {
        boolean autenticado = this.senha.equals(senha);
        if (autenticado) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Senha incorreta.");
        }
        return autenticado;
    }
}

class Torcedor extends MembroClube {
    private String tipoSocio;

    public Torcedor(String nome, int idade, String tipoSocio) {
        super(nome, idade);
        this.tipoSocio = tipoSocio;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Tipo de Sócio: " + this.tipoSocio);
    }

    public void setTipoSocio(String tipoSocio) { this.tipoSocio = tipoSocio; }
    public String getTipoSocio() { return this.tipoSocio; }
}



class Teste {
    public static void main(String[] args) {
        
        Presidente presidente = new Presidente("Carlos", 50, "12345");
        presidente.login("12345");
        
        List<MembroClube> membros = new ArrayList<>();
        

        membros.add(new Torcedor("João", 30, "Premium"));
        membros.add(new Torcedor("Maria", 25, "Comum"));
        membros.add(new Torcedor("Pedro", 30, "Vip"));

        membros.add(presidente); 

        System.out.println("\n--- Relatório Geral do Clube ---");

        for (MembroClube membro : membros) {
            membro.apresentar(); 
        }
    }
}