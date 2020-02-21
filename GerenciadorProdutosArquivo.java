package controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import model.Produtos;



public class GerenciadorProdutosArquivo {
	private List<Produtos> produtos = new ArrayList<Produtos>();
	
	public void lerArquivo  ()  throws IOException, ClassNotFoundException {
		FileInputStream fileInputStream = new FileInputStream("clientes.txt");
		ObjectInputStream prodInputStream = new ObjectInputStream(fileInputStream);
		this.produtos = (List <Produtos>) prodInputStream.readObject();
	}
	
	public void escreverArquivo () throws IOException {
		FileOutputStream fileOutput = new FileOutputStream("clientes.txt");
		ObjectOutputStream prodOutputStream = new ObjectOutputStream(fileOutput);
		prodOutputStream.writeObject(this.produtos);
		
	}
	
	public List<Produtos> ListarProdutos(){
		try {
			this.lerArquivo();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return produtos;
	}
	
	
	public Optional <Produtos> recuperarProduto(String id) {
		Optional<Produtos> produtoselecionado = Optional.empty();
	
		try {
			this.lerArquivo();
			produtoselecionado = produtos.stream().filter( (produto) -> produto.getId().equals(id) ).findFirst();       
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return produtoselecionado;
	}
	
	public void criarProduto(Produtos produto) {
		produtos.add(produto);
		try {
			this.escreverArquivo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void atualizarProduto(Produtos produto) {
		if (this.recuperarProduto(((Produtos) produtos).getId()).isPresent()) {
			produtos.remove(produto);
		}
		produtos.add(produto);
		try {
			this.escreverArquivo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

public void removerProduto(Produtos produto) {
	produtos.remove(produto);
	try {
		this.escreverArquivo();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

