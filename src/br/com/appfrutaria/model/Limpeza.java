package br.com.appfrutaria.model;

public class Limpeza extends Produto {
    private String fragrancia;

    public Limpeza(String nome, double preco, int quantidade, String fragrancia) {
        super(nome, preco, quantidade);
        this.fragrancia = fragrancia;
    }

    public String getFragrancia() {
        return fragrancia;
    }

    @Override
    public String toString() {
        return "Produto de Limpeza: " + getNome() +
               " | Preço: R$ " + getPreco() +
               " | Quantidade: " + getQuantidade() +
               " | Fragrância: " + fragrancia;
    }
}
