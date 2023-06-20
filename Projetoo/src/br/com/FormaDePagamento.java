package br.com;

public class FormaDePagamento {

	private String tipo;
	private String descricao;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void realizarPagamento(double valor) {
		System.out.println("O valor foi pago");
	}

	public void cartaoDeCredito(double valor) {
			System.out.println("O valor foi pago em cartão de crédito");

		}

	

	public void boleto(double valor) {
			System.out.println("O valor foi pago em boleto");
		}
	

	public void dinheiro(double valor) {
		System.out.println("O valor foi pago em dinheiro");
	}

}
