package br.com.appfrutaria.view;

import java.util.Scanner;
import br.com.appfrutaria.model.*;

public class Atendente {

    private Scanner sc = new Scanner(System.in);

    public int menuPrincipal() {
        System.out.println("""
        ===== MENU PRINCIPAL =====
        1 - Cadastrar
        2 - Listar
        3 - Pesquisar
        4 - Remover
        5 - Totais
        0 - Sair
        """);
        System.out.print("Escolha: ");
        return sc.nextInt();
    }

    public int submenuCadastrar() {
        System.out.println("""
        ===== CADASTRAR =====
        1 - Fruta
        2 - Verdura
        3 - Produto de Limpeza
        """);
        System.out.print("Escolha: ");
        return sc.nextInt();
    }

    public int submenuListar() {
        System.out.println("""
        ===== LISTAR =====
        1 - Frutas
        2 - Verduras
        3 - Produtos de Limpeza
        """);
        System.out.print("Escolha: ");
        return sc.nextInt();
    }

    public int submenuPesquisar() {
        System.out.println("""
        ===== PESQUISAR =====
        1 - Fruta
        2 - Verdura
        3 - Produto de Limpeza
        """);
        System.out.print("Escolha: ");
        return sc.nextInt();
    }

    public int submenuRemover() {
        System.out.println("""
        ===== REMOVER =====
        1 - Fruta
        2 - Verdura
        3 - Produto de Limpeza
        """);
        System.out.print("Escolha: ");
        return sc.nextInt();
    }

    public int submenuTotais() {
        System.out.println("""
        ===== TOTAIS =====
        1 - Total de Frutas
        2 - Total de Verduras
        3 - Total de Limpeza
        """);
        System.out.print("Escolha: ");
        return sc.nextInt();
    }

    public String frutaNome() {
        System.out.print("Nome da fruta: ");
        return sc.next();
    }

    public double frutaPreco() {
        System.out.print("Preço da fruta: ");
        return sc.nextDouble();
    }

    public int frutaQuantidade() {
        System.out.print("Quantidade da fruta: ");
        return sc.nextInt();
    }

    public String frutaTipo() {
        System.out.print("Tipo da fruta: ");
        return sc.next();
    }

    public String verduraNome() {
        System.out.print("Nome da verdura: ");
        return sc.next();
    }

    public double verduraPreco() {
        System.out.print("Preço da verdura: ");
        return sc.nextDouble();
    }

    public int verduraQuantidade() {
        System.out.print("Quantidade da verdura: ");
        return sc.nextInt();
    }

    public double verduraPeso() {
        System.out.print("Peso da verdura: ");
        return sc.nextDouble();
    }

    public String limpezaNome() {
        System.out.print("Nome do produto de limpeza: ");
        return sc.next();
    }

    public double limpezaPreco() {
        System.out.print("Preço do produto de limpeza: ");
        return sc.nextDouble();
    }

    public int limpezaQuantidade() {
        System.out.print("Quantidade do produto de limpeza: ");
        return sc.nextInt();
    }

    public String limpezaFragancia() {
        System.out.print("Fragrância do produto de limpeza: ");
        return sc.next();
    }

    public String pesquisarFruta() {
        System.out.print("Nome da fruta que deseja pesquisar: ");
        return sc.next();
    }

    public String pesquisarVerdura() {
        System.out.print("Nome da verdura que deseja pesquisar: ");
        return sc.next();
    }

    public String pesquisarLimpeza() {
        System.out.print("Nome do produto de limpeza que deseja pesquisar: ");
        return sc.next();
    }

    public String removerFruta() {
        System.out.print("Nome da fruta que deseja remover: ");
        return sc.next();
    }

    public String removerVerdura() {
        System.out.print("Nome da verdura que deseja remover: ");
        return sc.next();
    }

    public String removerLimpeza() {
        System.out.print("Nome do produto de limpeza que deseja remover: ");
        return sc.next();
    }

    public void vizualizarFruta(Fruta f) {
        System.out.println(f);
    }

    public void vizualizarVerdura(Verdura v) {
        System.out.println(v);
    }

    public void vizualizarLimpeza(Limpeza l) {
        System.out.println(l);
    }

    public void mensagemFrutaNaoEncontrado() {
        System.out.println("Fruta não encontrada.");
    }

    public void mensagemVerduraNaoEncontrada() {
        System.out.println("Verdura não encontrada.");
    }

    public void mensagemLimpezaNaoEncontrada() {
        System.out.println("Produto de limpeza não encontrado.");
    }

    public void vizualizarFrutaRemovida(String nome) {
        System.out.println("Fruta removida: " + nome);
    }

    public void vizualizarVerduraRemovida(String nome) {
        System.out.println("Verdura removida: " + nome);
    }

    public void vizualizarLimpezaRemovida(String nome) {
        System.out.println("Produto de limpeza removido: " + nome);
    }
}
