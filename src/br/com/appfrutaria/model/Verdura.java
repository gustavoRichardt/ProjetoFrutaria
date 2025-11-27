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
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public String verduraNome() {
        return getNome();
    }

    public double verduraPreco() {
        return getPreco();
    }

    public int verduraQuantidade() {
        return getQuantidade();
    }

    public double verduraPeso() {
        return getPeso();
    }
}