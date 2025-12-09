package br.com.appfrutaria.model;

public class Fruta extends Produto {
    private String tipo;

    public Fruta(String nome, double preco, int quantidade, String tipo) {
        super(nome, preco, quantidade);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Fruta: " + getNome() +
               " | Preço: R$ " + getPreco() +
               " | Quantidade: " + getQuantidade() +
               " | Tipo: " + tipo;
    }
}
