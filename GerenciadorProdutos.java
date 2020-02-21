package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Produtos;

public class GerenciadorProdutos extends Produtos {
	private Map<String ,Produtos> produto = new HashMap<String, Produtos>();
	
	
	public void criarProdutos(Produtos produto) {
		 
		produto.put(((Produtos) produto).getCodigo(), (Produtos) produto);
		
	}}
