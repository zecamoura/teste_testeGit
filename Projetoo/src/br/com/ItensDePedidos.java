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

		quantidade++;
		System.out.println("A quantidade do produto é de" + quantidade);

		return incrementaQtde();

	}

	public boolean decrementaQtde() {

		quantidade--;
		System.out.println("A quantidade do produto é de" + quantidade);

		return decrementaQtde();
	}

	public double calcularSubTotal() {
		return quantidade;
		


	}

}
