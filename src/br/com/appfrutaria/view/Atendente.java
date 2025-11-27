package br.com.appfrutaria.view;

import java.util.Scanner;

import br.com.appfrutaria.model.Produto;
import br.com.appfrutaria.model.Fruta;
import br.com.appfrutaria.model.Verdura;

public class Atendente {
    private Scanner input;

    public Atendente() {
        input = new Scanner(System.in);
    }

    public int menuPrincipal() {
        System.out.println("\n=== MENU PRINCIPAL ===");
        System.out.println("1 - Cadastrar fruta");
        System.out.println("2 - Cadastrar verdura");
        System.out.println("3 - Listar frutas");
        System.out.println("4 - Listar verduras");
        System.out.println("5 - Pesquisar fruta");
        System.out.println("6 - Pesquisar verdura");
        System.out.println("7 - Remover fruta");
        System.out.println("8 - Remover verdura");
        System.out.println("9 - Verificar total de frutas");
        System.out.println("10 - Verficar total de verduras");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = input.nextInt();
        input.nextLine();
        return opcao;
    }

    public String frutaNome() {
        System.out.print("Digite o nome da fruta: ");
        return input.nextLine();
    }

    public double frutaPreco() {
        System.out.print("Digite o preço da fruta: ");
        double preco = input.nextDouble();
        input.nextLine();
        return preco;
    }

    public int frutaQuantidade() {
        System.out.print("Digite a quantidade: ");
        int quantidade = input.nextInt();
        input.nextLine();
        return quantidade;
    }

    public String frutaTipo() {
        System.out.print("Digite o tipo da fruta: ");
        return input.nextLine(); 
    }
    
    public String pesquisarFruta() { 
	    System.out.print("Digite o nome da fruta a pesquisar: ");
	    return input.nextLine();
	}

    public String removerFruta() {
        System.out.print("Digite o nome da fruta a remover: ");
        return input.nextLine();
    }

    public void vizualizarFrutaRemovida(String nome) {
        System.out.println("A fruta '" + nome + "' foi removida.");
    }

    public void mensagemFrutaNaoEncontrado() {
        System.out.println("Fruta não encontrada.");
    }

    
    					//
    
    public String verduraNome() {
        System.out.print("Digite o nome da fruta: ");
        return input.nextLine();
    }

    public double verduraPreco() {
        System.out.print("Digite o preço da fruta: ");
        double preco = input.nextDouble();
        input.nextLine();
        return preco;
    }

    public int verduraQuantidade() {
        System.out.print("Digite a quantidade: ");
        int quantidade = input.nextInt();
        input.nextLine();
        return quantidade;
    }

    public double verduraPeso() {
        System.out.print("Digite o peso da verdura: ");
       double peso = input.nextDouble();
       input.nextLine();
       return peso;
       
    }
    	public String pesquisarVerdura() { 
    	    System.out.print("Digite o nome da verdura a pesquisar: ");
    	    return input.nextLine();
    	}
    
    public String removerVerdura() {
        System.out.print("Digite o nome da verdura a remover: ");
        return input.nextLine();
    }

    public void vizualizarVerduraRemovida(String nome) {
        System.out.println("A verdura '" + nome + "' foi removida.");
    }

    public void mensagemVerduraNaoEncontrada() {
        System.out.println("Verdura não encontrada.");
    }
    
    
    public void vizualizarFruta(Fruta fruta) {
        System.out.println("\n--- FRUTA ---");
        System.out.println("Nome: " + fruta.getNome());
        System.out.println("Preço: R$ " + fruta.getPreco());
        System.out.println("Quantidade: " + fruta.getQuantidade());
        System.out.println("Tipo: " + fruta.getTipo());
    }
    
    
    public void vizualizarVerdura(Verdura verdura) {
        System.out.println("\n--- VERDURA ---");
        System.out.println("Nome: " + verdura.getNome());
        System.out.println("Preço: R$ " + verdura.getPreco());
        System.out.println("Quantidade: " + verdura.getQuantidade());
        System.out.println("Peso: " + verdura.getPeso());
    }

    public void finalizarApp() {
        System.out.println("Sistema encerrado.");
        input.close();
    }
}