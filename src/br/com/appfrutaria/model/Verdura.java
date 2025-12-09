package br.com.appfrutaria.model;

public class Verdura extends Produto {
    private double peso;

    public Verdura(String nome, double preco, int quantidade, double peso) {
        super(nome, preco, quantidade);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Verdura: " + getNome() +
               " | Preço: R$ " + getPreco() +
               " | Quantidade: " + getQuantidade() +
               " | Peso: " + peso + "kg";
    }
}
