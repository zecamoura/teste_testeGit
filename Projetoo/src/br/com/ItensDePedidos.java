package br.com;

public class ItensDePedidos {

	private int quantidade;
	private Produto produto;
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public boolean incrementaQtde() {
		return true;
	
	}
	
	 public boolean decrementaQtde() {
		return false;
		 
	}
	
	 public double calcularSubTotal() {
		return calcularSubTotal();
		 
	}
	
	
	
	
}
