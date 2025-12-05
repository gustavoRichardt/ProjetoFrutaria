package br.com.appfrutaria.model;

public class Limpeza extends Produto {
	
	private String fragancia;
	
	public Limpeza (String nome, double preco, int quantidade, String fragancia) {
		
		super(nome, preco, quantidade);
		this.fragancia = fragancia;
	}
	
	public String getFragancia() {
        return fragancia;
    }
	
    public void setFragancia(String fragancia) {
        this.fragancia = fragancia;
    }
	
    public String limpezaNome() {
    	return nome;
    }
    
    public double limpezaPreco(double preco) {
    	return preco;
    }
    
    public int limpezaQuantidade() {
    	return quantidade;
    }
}