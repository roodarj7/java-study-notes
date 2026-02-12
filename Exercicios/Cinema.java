package Exercicios;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// Classe simples de modelo
class Filme {
    String nome;
    
    public Filme(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return "Filme: " + nome;
    }
}

public class Cinema {
    @SuppressWarnings("finally")
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // 1. Criando a lista e adicionando filmes
            var catalogo = new ArrayList<Filme>();
            catalogo.add(new Filme("Matrix"));          // Indice 0
            catalogo.add(new Filme("O Poderoso Chefão")); // Indice 1
            catalogo.add(new Filme("Interestelar"));    // Indice 2

            System.out.println("Temos " + catalogo.size() + " filmes disponíveis.");
            System.out.println("Digite o número do índice do filme que quer assistir: ");

            // --- SUA MISSÃO COMEÇA AQUI ---
            
            try {
                // 1. Peça para o scanner ler um número inteiro (int)
                int indice = scanner.nextInt();
                // 2. Pegue o filme da lista usando esse número e imprima o nome dele
                Filme f = catalogo.get(indice);
                System.out.println(f);
                // 3. Imprima uma mensagem de sucesso "Bom filme!"
                System.out.println("Bom filme!");

            } catch (InputMismatchException e) {
                System.out.println("Erro: Você precisa digitar um número inteiro!");
                
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Erro: Esse número de filme não existe na lista.");
                
            } finally {

                do {
                
                } while(true);
            }
        }
    }
}