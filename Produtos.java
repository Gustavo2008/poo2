package model;

import java.time.LocalDate;

public class Produtos {
	private String Id;
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	private String codigo;
	
	private String descricao;
	
	private String preco;
	
	private String validade;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String precoProduto) {
		this.preco = precoProduto;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validadeProduto) {
		this.validade = validadeProduto;
	}

	public void put(String codigo2, Produtos produto) {
		// TODO Auto-generated method stub
		
	}

	

	




	
	
	
	
	

}
